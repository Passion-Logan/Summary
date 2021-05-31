package DesignPatterns.ChainOfResponsibility;

/**
 * @author wql
 * @desc OrcSoldier
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class OrcSoldier extends RequestHandler {
    public OrcSoldier(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (RequestType.COLLECT_TAX == req.getRequestType()) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "兽人士兵";
    }

}
