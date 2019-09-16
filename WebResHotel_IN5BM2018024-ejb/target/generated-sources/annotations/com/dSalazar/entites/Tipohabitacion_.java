package com.dSalazar.entites;

import com.dSalazar.entites.Reserva;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-16T10:33:59")
@StaticMetamodel(Tipohabitacion.class)
public class Tipohabitacion_ { 

    public static volatile SingularAttribute<Tipohabitacion, String> descripcion;
    public static volatile SingularAttribute<Tipohabitacion, Double> precio;
    public static volatile SingularAttribute<Tipohabitacion, Integer> numeropiso;
    public static volatile SingularAttribute<Tipohabitacion, Integer> idtipohabitacion;
    public static volatile ListAttribute<Tipohabitacion, Reserva> reservaList;
    public static volatile SingularAttribute<Tipohabitacion, Integer> nohabitacion;
    public static volatile SingularAttribute<Tipohabitacion, Integer> nopersonas;

}