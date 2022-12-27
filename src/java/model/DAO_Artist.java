
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DAO_Artist extends Conexion implements DAO <Artist> {

    public DAO_Artist() throws ClassNotFoundException, SQLException {
        super("test6");
    }

    @Override
    public void create(Artist ob) throws SQLException {
        ejecutar("INSERT INTO Artista VALUES (NULL, '"+ob.getArtist_name()+"'"
                + ", '"+ob.getMost_popular_song()+"', "+ob.getMost_popular_song()+" ');  ");
    }

    @Override
    public List<Artist> read() throws SQLException {
        List<Artist> lista= new ArrayList<Artist>();
        
        ResultSet rs=ejecutar("SELECT * FROM Artist;");
        
        Artist a;
        while(rs.next()){
            a=new Artist();
            
            a.setId(rs.getInt(1));
            a.setArtist_name(rs.getString(2));
            a.setMost_popular_song(rs.getString(3));
            a.setMost_popular_member(rs.getString(4));
                      
            
            lista.add(a);
        }
        
        return lista;
    }

    @Override
    public void update(Artist ob) throws SQLException {
//        ejecutar("UPDATE Artista ");
    }

    @Override
    public void delete(String id) throws SQLException {
        //ejecutar("DELETE FROM Artista WHERE id='"+id+"'; ");
    }

   
    
    
     
}
