package main;

public abstract class AbstractGameConnectHelper {
    
    /**
     * 각 프로세스를 담당하는 메소드들을 구현해야함
     */
    protected abstract String[] doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String username);
    protected abstract String connection(String info);
    
    /**
     * 일정한 프로세스 실행하는 메소드
     */
    public final String requestConnection(String encodedInfo) {
        String[] decodedInfo = doSecurity(encodedInfo);
        String id = decodedInfo[0];
        String password = decodedInfo[1];
        boolean valid = authentication(id, password);
        
        if (!valid) {
            throw new IllegalAccessError("not valid user info");
        }
        int auth = authorization(id);
        String authority = null;
        switch (auth) {
        case 0:
            authority = "ADMIN";
            break;
        case 1:
            authority = "USER";
            break;
        default:
            authority = "Unkown";
            break;
        }
        return connection(authority);
    }
}
