package com.dSalazar.entites;

import com.dSalazar.entites.Cliente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-16T10:33:59")
@StaticMetamodel(Pago.class)
public class Pago_ { 

    public static volatile SingularAttribute<Pago, Integer> idpago;
    public static volatile SingularAttribute<Pago, String> concepto;
    public static volatile SingularAttribute<Pago, Date> fechasalida;
    public static volatile SingularAttribute<Pago, Cliente> idcliente;

}