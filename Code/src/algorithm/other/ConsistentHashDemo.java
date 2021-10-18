package algorithm.other;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 一致性hash算法demo
 */
public class ConsistentHashDemo {

    /**
     * 待加入Hash环的服务器列表
     */
    private static String[] servers = {"10.0.0.1", "10.0.0.2", "10.0.0.3"};

    /**
     * key表示服务器的hash值，value表示服务器
     */
    private static SortedMap<Integer, String> sortedMap = new TreeMap<>();

    /**
     * 程序初始化，将所有服务器放入sortedMap中
     */
    static {
        for (int i = 0; i < servers.length; i++) {
            int hash = getHash(servers[i]);
            System.out.println("[" + servers[i] + "]加入map中, 其Hash值为" + hash);
            sortedMap.put(hash, servers[i]);
        }
    }

    /**
     * 得到路由到的节点
     *
     * @param key
     * @return
     */
    private static String getServer(String key) {
        // 得到该key的hash值
        Integer hash = getHash(key);
        // 得到大于该Hash值的所有Map
        SortedMap<Integer, String> subMap = sortedMap.tailMap(hash);
        if (subMap.isEmpty()) {
            // 如果没有比该key的hash值大的，则从第一个node开始
            Integer i = sortedMap.firstKey();
            // 返回对应的服务器
            return sortedMap.get(i);
        } else {
            // 第一个Key就是顺时针过去离node最近的那个节点
            Integer i = subMap.firstKey();
            // 返回对应的服务器
            return subMap.get(i);
        }
    }

    /**
     * 使用FNV1_32_HASH算法计算HASH
     *
     * @param str
     * @return
     */
    private static int getHash(String str) {
        final int p = 16777619;
        int hash = (int) 2166136261L;
        for (int i = 0; i < str.length(); i++) {
            hash = (hash ^ str.charAt(i)) * p;
        }
        hash += hash << 13;
        hash ^= hash >> 7;
        hash += hash << 3;
        hash ^= hash >> 17;
        hash += hash << 5;

        // 如果算出来的值为负数则取其绝对值
        if (hash < 0) {
            hash = Math.abs(hash);
        }
        return hash;
    }

    public static void main(String[] args) {
        String[] keys = {"医生", "护士", "患者"};
        for (int i = 0; i < keys.length; i++) {
            System.out.println("[" + keys[i] + "]的hash值为" + getHash(keys[i])
                    + ", 被路由到结点[" + getServer(keys[i]) + "]");
        }
    }
}
