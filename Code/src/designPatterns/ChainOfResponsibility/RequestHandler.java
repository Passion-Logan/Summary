package designPatterns.ChainOfResponsibility;

/**
 * @author wql
 * @desc RequestHandler
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public abstract class RequestHandler {

    private final RequestHandler next;

    protected RequestHandler(RequestHandler next) {
        this.next = next;
    }

    /**
     * Request handler.
     */
    public void handleRequest(Request req) {
        if (next != null) {
            next.handleRequest(req);
        }
    }

    protected void printHandling(Request req) {
        System.out.println(String.format("%s 处理请求 %s", this, req));
    }

    @Override
    public abstract String toString();

}
