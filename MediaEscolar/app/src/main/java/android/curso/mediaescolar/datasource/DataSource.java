package android.curso.mediaescolar.datasource;

import android.content.Context;
import android.curso.mediaescolar.datamodel.MediaEscolarDataModel;
import android.curso.mediaescolar.model.MediaEscolar;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;


public class DataSource extends SQLiteOpenHelper{

    private static final String DB_NAME = "media_escolar.sqlite";
    private static final int DB_VERSION = 1;

    SQLiteDatabase db;


    public DataSource(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        try {

            db.execSQL(MediaEscolarDataModel.criarTabela());
        }catch (Exception e){

        }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
