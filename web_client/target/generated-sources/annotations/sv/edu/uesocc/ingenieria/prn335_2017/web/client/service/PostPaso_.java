package sv.edu.uesocc.ingenieria.prn335_2017.web.client.service;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.web.client.service.Paso;
import sv.edu.uesocc.ingenieria.prn335_2017.web.client.service.Post;
import sv.edu.uesocc.ingenieria.prn335_2017.web.client.service.PostPasoPK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-23T22:50:43")
@StaticMetamodel(PostPaso.class)
public class PostPaso_ { 

    public static volatile SingularAttribute<PostPaso, PostPasoPK> postPasoPK;
    public static volatile SingularAttribute<PostPaso, Integer> idRol;
    public static volatile SingularAttribute<PostPaso, Post> post;
    public static volatile SingularAttribute<PostPaso, Integer> idUsuario;
    public static volatile SingularAttribute<PostPaso, Boolean> aprobado;
    public static volatile SingularAttribute<PostPaso, Paso> paso;
    public static volatile SingularAttribute<PostPaso, Integer> idCategoria;
    public static volatile SingularAttribute<PostPaso, String> comentarios;

}