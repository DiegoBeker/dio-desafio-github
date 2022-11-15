package dio.springbootweb.handler;

public class CampoObrigatorioException extends BusinessException {
    public CampoObrigatorioException(String mensagem) {
        super("O campo %s é obrigatório", mensagem);
    }
}
