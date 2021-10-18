package designPatterns.ChainOfResponsibility;

/**
 * @author wql
 * @desc OrcKing
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class OrcKing {

    private RequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    private void buildChain() {
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request req) {
        chain.handleRequest(req);
    }

}
