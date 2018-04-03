package by.kolbun.andersen.webservices;

import by.kolbun.andersen.entity.Address;
import by.kolbun.andersen.entity.Person;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//@WebService(serviceName = "myService")
@WebService(endpointInterface = "by.kolbun.andersen.webservices.MyWebServiceImpl")
public class MyWebServiceImpl {

    @WebMethod
    public Person addNewPerson(@WebParam(name = "id") int id,
                               @WebParam(name = "name") String name,
                               @WebParam(name = "street") String street,
                               @WebParam(name = "house") int house) throws IOException {
        List<Address> list = new ArrayList<>();
        list.add(new Address(0, street, house));
        list.add(new Address(1, street + "new", house + 1000));
        Person p = new Person(id, name, list);
        System.out.println(p);
        return p;
    }
    /*<id>41</id>
      <name>name41</name>
      <street>street1</street>
      <house>11</house>*/

    @WebMethod
    public Person appendNameWithNew(@WebParam(name = "person") Person p) {
        System.out.println("old one:\n" + p);
        p.setName(p.getName() + "new");
        System.out.println("returned one:\n" + p);
        return p;
    }
    /*<person>
        <id>11</id>
      	<name>name11</name>
      	<address_list>
      	    <address item_id="0">
      			<street>street22</street>
      			<house>22</house>
			</address>
      	</address_list>
      </person>*/
}
