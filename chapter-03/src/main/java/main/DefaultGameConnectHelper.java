package main;

public class DefaultGameConnectHelper extends AbstractGameConnectHelper {

    @Override
    protected String[] doSecurity(String string) {
        // 구현
        return null;
    }

    @Override
    protected boolean authentication(String id, String password) {
        // 구현
        return false;
    }

    @Override
    protected int authorization(String username) {
        // 구현
        return 0;
    }

    @Override
    protected String connection(String info) {
        // 구현
        return null;
    }
}
