package ProxyPattern;

public class ProxySearcher implements Searcher {

    private RealSearcher searcher = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;

    @Override
    public String doSearch(String userId, String keyword) {
        if (this.Validate(userId)) {
            String result = searcher.doSearch(userId, keyword);
            this.Log(userId);
            return result;
        } else {
            return null;
        }
    }

    public Boolean Validate(String userId) {
        validator = new AccessValidator();
        return validator.Validate(userId);
    }

    public void Log(String userId) {
        logger = new Logger();
        logger.Log(userId);
    }
}
