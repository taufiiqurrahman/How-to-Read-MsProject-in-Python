//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.01.26 at 09:42:19 AM GMT
//

package net.sf.mpxj.mspdi.schema;

import java.util.UUID;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter15 extends XmlAdapter<String, UUID>
{

   @Override public UUID unmarshal(String value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.parseUUID(value));
   }

   @Override public String marshal(UUID value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.printUUID(value));
   }

}
