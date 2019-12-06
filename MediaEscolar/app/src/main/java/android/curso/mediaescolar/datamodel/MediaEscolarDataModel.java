package android.curso.mediaescolar.datamodel;

public class MediaEscolarDataModel {


    private final static String TABELA = "media_escolar";

    private final static String id = "id";
    private final String materia = "materia";
    private final String bimestre = "bimestre";
    private final String situacao = "situacao";
    private final String notaProva = "notaProva";
    private final String notaMateria = "notaMateria";
    private final String mediaFinal = "mediaFinal";

    private static String queryCriarTabela = "";

    public static String getTABELA() {
        return TABELA;
    }

    public static String getId() {
        return id;
    }

    public static String getQueryCriarTabela() {
        return queryCriarTabela;
    }

    public static void setQueryCriarTabela(String queryCriarTabela) {
        MediaEscolarDataModel.queryCriarTabela = queryCriarTabela;
    }

    public static String criarTabela(){

        setQueryCriarTabela(getQueryCriarTabela() + "CREATE TABLE"+ getTABELA());
        setQueryCriarTabela(getQueryCriarTabela() + " (");
        setQueryCriarTabela(getQueryCriarTabela() + getId() + " INTEGER PRIMARY KEY, ");
        setQueryCriarTabela(getQueryCriarTabela() + getMateria() + " TEXT, ");
        setQueryCriarTabela(getQueryCriarTabela() + getBimestre() + " TEXT, ");
        setQueryCriarTabela(getQueryCriarTabela() + getSituacao() + " TEXT, ");
        setQueryCriarTabela(getQueryCriarTabela() + getNotaProva() + " REAL, ");
        setQueryCriarTabela(getQueryCriarTabela() + getNotaMateria() + " REAL, ");
        setQueryCriarTabela(getQueryCriarTabela() + getMediaFinal() + " REAL ");
        setQueryCriarTabela(getQueryCriarTabela() + " )");

        return getQueryCriarTabela();
    }

    public String getMateria() {
        return materia;
    }

    public String getBimestre() {
        return bimestre;
    }

    public String getSituacao() {
        return situacao;
    }

    public String getNotaProva() {
        return notaProva;
    }

    public String getNotaMateria() {
        return notaMateria;
    }

    public String getMediaFinal() {
        return mediaFinal;
    }
}
