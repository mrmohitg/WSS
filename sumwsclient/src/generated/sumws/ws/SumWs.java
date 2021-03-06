package sumws.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2021-03-11T20:30:41.720+05:30
 * Generated source version: 3.1.9
 * 
 */
@WebService(targetNamespace = "http://ws.sumws/", name = "SumWs")
@XmlSeeAlso({ObjectFactory.class})
public interface SumWs {

    @WebMethod
    @RequestWrapper(localName = "calculateSum", targetNamespace = "http://ws.sumws/", className = "sumws.ws.CalculateSum")
    @ResponseWrapper(localName = "calculateSumResponse", targetNamespace = "http://ws.sumws/", className = "sumws.ws.CalculateSumResponse")
    @WebResult(name = "response", targetNamespace = "")
    public sumws.ws.SumResponse calculateSum(
        @WebParam(name = "arg0", targetNamespace = "")
        sumws.ws.SumRequest arg0
    );
}
