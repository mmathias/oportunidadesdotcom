package br.com.oportunidades.DAO;

public class ConexaoBancoSingleton {
    private String jdbcDriver;
    private String jdbcLogin;
    private String jdbcSenha;
    private String jdbcURL;

    private static ConexaoBancoSingleton instance = null;
    
    public static ConexaoBancoSingleton getInstance() {
        if(instance == null) {
            instance = new ConexaoBancoSingleton();
        }
        return instance;
    }

    private ConexaoBancoSingleton() {
    }

    public String getJdbcLogin() {
        return jdbcLogin;
    }

    public void setJdbcLogin(String jdbcLogin) {
        this.jdbcLogin = jdbcLogin;
    }

    public String getJdbcSenha() {
        return jdbcSenha;
    }

    public void setJdbcSenha(String jdbcSenha) {
        this.jdbcSenha = jdbcSenha;
    }

    public String getJdbcURL() {
        return jdbcURL;
    }

    public void setJdbcURL(String jdbcURL) {
        this.jdbcURL = jdbcURL;
    }

    public static void setInstance(ConexaoBancoSingleton aInstance) {
        instance = aInstance;
    }

    public String getJdbcDriver() {
        return jdbcDriver;
    }

    public void setJdbcDriver(String jdbcDriver) {
        this.jdbcDriver = jdbcDriver;
    }
    
}
