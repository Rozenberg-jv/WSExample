package by.kolbun.andersen.webservices;

import by.kolbun.andersen.entity.Address;
import by.kolbun.andersen.entity.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebService
public class WebServiceImpl {
    private JacksonXmlModule module;
    private ObjectMapper mapper;

    public WebServiceImpl() {
        module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        mapper = new XmlMapper(module);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    @WebMethod
    public String getPersonsAddressList(int id, String name, String street, int house) throws IOException {
        List<Address> list = new ArrayList<>();
        list.add(new Address(0, street, house));
        list.add(new Address(1, street + "new", house + 1000));
        Person p = new Person(id, name, list);
        System.out.println(p);
        String s = mapper.writeValueAsString(p);
        System.out.println(s);
        return s;
    }

    @WebMethod
    public void getXmlPerson(Person p) {
        System.out.println(p);
    }

    /*@WebMethod
    public Person getXmlPerson(String s) {
        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        ObjectMapper mapper = new XmlMapper(module);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        Person p = ;

        return p;
    }*/

    /*@WebMethod
    public List<Person> getNewPerson() {
        List<Address> list1 = new ArrayList<>();
        list1.add(new Address(0, "street1", 11));
        List<Address> list2 = new ArrayList<>();
        list2.add(new Address(1, "street3", 13));

        List<Person> result = new ArrayList<>();
        result.add(new Person(100, "name1", list1));
        result.add(new Person(101, "name2", list2));

        return result;
    }*/
}
