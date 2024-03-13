//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.06.16 at 11:06:06 AM BST
//

package net.sf.mpxj.conceptdraw.schema;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import net.sf.mpxj.Priority;

/**
 * &lt;p&gt;Java class for PPVItemsType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="PPVItemsType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="PPVItem" maxOccurs="unbounded"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="CompleteJournal" minOccurs="0"&amp;gt;
 *                     &amp;lt;complexType&amp;gt;
 *                       &amp;lt;complexContent&amp;gt;
 *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                           &amp;lt;sequence&amp;gt;
 *                             &amp;lt;element name="CompleteJournalEntry" maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *                               &amp;lt;complexType&amp;gt;
 *                                 &amp;lt;complexContent&amp;gt;
 *                                   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                                     &amp;lt;sequence&amp;gt;
 *                                       &amp;lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
 *                                       &amp;lt;element name="Complete" type="{http://www.w3.org/2001/XMLSchema}decimal"/&amp;gt;
 *                                     &amp;lt;/sequence&amp;gt;
 *                                   &amp;lt;/restriction&amp;gt;
 *                                 &amp;lt;/complexContent&amp;gt;
 *                               &amp;lt;/complexType&amp;gt;
 *                             &amp;lt;/element&amp;gt;
 *                           &amp;lt;/sequence&amp;gt;
 *                         &amp;lt;/restriction&amp;gt;
 *                       &amp;lt;/complexContent&amp;gt;
 *                     &amp;lt;/complexType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;choice&amp;gt;
 *                     &amp;lt;element name="ProjectID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *                     &amp;lt;sequence&amp;gt;
 *                       &amp;lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *                       &amp;lt;group ref="{http://www.schemas.conceptdraw.com/cdprj/document.xsd}ProjectProps"/&amp;gt;
 *                       &amp;lt;element name="CompleteJournalTrackingPeriod" type="{http://www.schemas.conceptdraw.com/cdprj/document.xsd}LongTimeUnitType"/&amp;gt;
 *                       &amp;lt;element ref="{http://www.schemas.conceptdraw.com/cdprj/document.xsd}Callouts" minOccurs="0"/&amp;gt;
 *                       &amp;lt;element name="PPVItems" type="{http://www.schemas.conceptdraw.com/cdprj/document.xsd}PPVItemsType"/&amp;gt;
 *                     &amp;lt;/sequence&amp;gt;
 *                   &amp;lt;/choice&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "PPVItemsType", propOrder =
{
   "ppvItem"
}) public class PPVItemsType
{

   @XmlElement(name = "PPVItem", required = true) protected List<PPVItemsType.PPVItem> ppvItem;

   /**
    * Gets the value of the ppvItem property.
    *
    * &lt;p&gt;
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ppvItem property.
    *
    * &lt;p&gt;
    * For example, to add a new item, do as follows:
    * &lt;pre&gt;
    *    getPPVItem().add(newItem);
    * &lt;/pre&gt;
    *
    *
    * &lt;p&gt;
    * Objects of the following type(s) are allowed in the list
    * {@link PPVItemsType.PPVItem }
    *
    *
    */
   public List<PPVItemsType.PPVItem> getPPVItem()
   {
      if (ppvItem == null)
      {
         ppvItem = new ArrayList<>();
      }
      return this.ppvItem;
   }

   /**
    * &lt;p&gt;Java class for anonymous complex type.
    *
    * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
    *
    * &lt;pre&gt;
    * &amp;lt;complexType&amp;gt;
    *   &amp;lt;complexContent&amp;gt;
    *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
    *       &amp;lt;sequence&amp;gt;
    *         &amp;lt;element name="CompleteJournal" minOccurs="0"&amp;gt;
    *           &amp;lt;complexType&amp;gt;
    *             &amp;lt;complexContent&amp;gt;
    *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
    *                 &amp;lt;sequence&amp;gt;
    *                   &amp;lt;element name="CompleteJournalEntry" maxOccurs="unbounded" minOccurs="0"&amp;gt;
    *                     &amp;lt;complexType&amp;gt;
    *                       &amp;lt;complexContent&amp;gt;
    *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
    *                           &amp;lt;sequence&amp;gt;
    *                             &amp;lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
    *                             &amp;lt;element name="Complete" type="{http://www.w3.org/2001/XMLSchema}decimal"/&amp;gt;
    *                           &amp;lt;/sequence&amp;gt;
    *                         &amp;lt;/restriction&amp;gt;
    *                       &amp;lt;/complexContent&amp;gt;
    *                     &amp;lt;/complexType&amp;gt;
    *                   &amp;lt;/element&amp;gt;
    *                 &amp;lt;/sequence&amp;gt;
    *               &amp;lt;/restriction&amp;gt;
    *             &amp;lt;/complexContent&amp;gt;
    *           &amp;lt;/complexType&amp;gt;
    *         &amp;lt;/element&amp;gt;
    *         &amp;lt;choice&amp;gt;
    *           &amp;lt;element name="ProjectID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
    *           &amp;lt;sequence&amp;gt;
    *             &amp;lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
    *             &amp;lt;group ref="{http://www.schemas.conceptdraw.com/cdprj/document.xsd}ProjectProps"/&amp;gt;
    *             &amp;lt;element name="CompleteJournalTrackingPeriod" type="{http://www.schemas.conceptdraw.com/cdprj/document.xsd}LongTimeUnitType"/&amp;gt;
    *             &amp;lt;element ref="{http://www.schemas.conceptdraw.com/cdprj/document.xsd}Callouts" minOccurs="0"/&amp;gt;
    *             &amp;lt;element name="PPVItems" type="{http://www.schemas.conceptdraw.com/cdprj/document.xsd}PPVItemsType"/&amp;gt;
    *           &amp;lt;/sequence&amp;gt;
    *         &amp;lt;/choice&amp;gt;
    *       &amp;lt;/sequence&amp;gt;
    *     &amp;lt;/restriction&amp;gt;
    *   &amp;lt;/complexContent&amp;gt;
    * &amp;lt;/complexType&amp;gt;
    * &lt;/pre&gt;
    *
    *
    */
   @XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder =
   {
      "completeJournal",
      "projectID",
      "id",
      "name",
      "author",
      "company",
      "startDate",
      "finishDate",
      "budget",
      "goal",
      "site",
      "note",
      "baselineCost",
      "baselineStartDate",
      "baselineFinishDate",
      "showSubtasks",
      "priority",
      "isVisibleSubitems",
      "styleProject",
      "markerID",
      "hyperlinks",
      "completeJournalTrackingPeriod",
      "callouts",
      "ppvItems"
   }) public static class PPVItem
   {

      @XmlElement(name = "CompleteJournal") protected PPVItemsType.PPVItem.CompleteJournal completeJournal;
      @XmlElement(name = "ProjectID", type = String.class) @XmlJavaTypeAdapter(Adapter6.class) @XmlSchemaType(name = "int") protected Integer projectID;
      @XmlElement(name = "ID", type = String.class) @XmlJavaTypeAdapter(Adapter6.class) @XmlSchemaType(name = "int") protected Integer id;
      @XmlElement(name = "Name") protected String name;
      @XmlElement(name = "Author") protected String author;
      @XmlElement(name = "Company") protected String company;
      @XmlElement(name = "StartDate", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime startDate;
      @XmlElement(name = "FinishDate", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime finishDate;
      @XmlElement(name = "Budget", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "double") protected Double budget;
      @XmlElement(name = "Goal") protected String goal;
      @XmlElement(name = "Site") protected String site;
      @XmlElement(name = "Note") protected String note;
      @XmlElement(name = "BaselineCost", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "double") protected Double baselineCost;
      @XmlElement(name = "BaselineStartDate", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime baselineStartDate;
      @XmlElement(name = "BaselineFinishDate", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime baselineFinishDate;
      @XmlElement(name = "ShowSubtasks") protected Boolean showSubtasks;
      @XmlElement(name = "Priority", type = String.class) @XmlJavaTypeAdapter(Adapter7.class) protected Priority priority;
      @XmlElement(name = "IsVisibleSubitems") protected Boolean isVisibleSubitems;
      @XmlElement(name = "StyleProject") protected StyleProject styleProject;
      @XmlElement(name = "MarkerID", type = String.class) @XmlJavaTypeAdapter(Adapter6.class) @XmlSchemaType(name = "int") protected Integer markerID;
      @XmlElement(name = "Hyperlinks") protected Hyperlinks hyperlinks;
      @XmlElement(name = "CompleteJournalTrackingPeriod", type = String.class) @XmlJavaTypeAdapter(Adapter6.class) @XmlSchemaType(name = "int") protected Integer completeJournalTrackingPeriod;
      @XmlElement(name = "Callouts") protected Callouts callouts;
      @XmlElement(name = "PPVItems") protected PPVItemsType ppvItems;

      /**
       * Gets the value of the completeJournal property.
       *
       * @return
       *     possible object is
       *     {@link PPVItemsType.PPVItem.CompleteJournal }
       *
       */
      public PPVItemsType.PPVItem.CompleteJournal getCompleteJournal()
      {
         return completeJournal;
      }

      /**
       * Sets the value of the completeJournal property.
       *
       * @param value
       *     allowed object is
       *     {@link PPVItemsType.PPVItem.CompleteJournal }
       *
       */
      public void setCompleteJournal(PPVItemsType.PPVItem.CompleteJournal value)
      {
         this.completeJournal = value;
      }

      /**
       * Gets the value of the projectID property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public Integer getProjectID()
      {
         return projectID;
      }

      /**
       * Sets the value of the projectID property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setProjectID(Integer value)
      {
         this.projectID = value;
      }

      /**
       * Gets the value of the id property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public Integer getID()
      {
         return id;
      }

      /**
       * Sets the value of the id property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setID(Integer value)
      {
         this.id = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
         return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
         this.name = value;
      }

      /**
       * Gets the value of the author property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getAuthor()
      {
         return author;
      }

      /**
       * Sets the value of the author property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setAuthor(String value)
      {
         this.author = value;
      }

      /**
       * Gets the value of the company property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getCompany()
      {
         return company;
      }

      /**
       * Sets the value of the company property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setCompany(String value)
      {
         this.company = value;
      }

      /**
       * Gets the value of the startDate property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public LocalDateTime getStartDate()
      {
         return startDate;
      }

      /**
       * Sets the value of the startDate property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setStartDate(LocalDateTime value)
      {
         this.startDate = value;
      }

      /**
       * Gets the value of the finishDate property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public LocalDateTime getFinishDate()
      {
         return finishDate;
      }

      /**
       * Sets the value of the finishDate property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setFinishDate(LocalDateTime value)
      {
         this.finishDate = value;
      }

      /**
       * Gets the value of the budget property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public Double getBudget()
      {
         return budget;
      }

      /**
       * Sets the value of the budget property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setBudget(Double value)
      {
         this.budget = value;
      }

      /**
       * Gets the value of the goal property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getGoal()
      {
         return goal;
      }

      /**
       * Sets the value of the goal property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setGoal(String value)
      {
         this.goal = value;
      }

      /**
       * Gets the value of the site property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getSite()
      {
         return site;
      }

      /**
       * Sets the value of the site property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setSite(String value)
      {
         this.site = value;
      }

      /**
       * Gets the value of the note property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getNote()
      {
         return note;
      }

      /**
       * Sets the value of the note property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setNote(String value)
      {
         this.note = value;
      }

      /**
       * Gets the value of the baselineCost property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public Double getBaselineCost()
      {
         return baselineCost;
      }

      /**
       * Sets the value of the baselineCost property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setBaselineCost(Double value)
      {
         this.baselineCost = value;
      }

      /**
       * Gets the value of the baselineStartDate property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public LocalDateTime getBaselineStartDate()
      {
         return baselineStartDate;
      }

      /**
       * Sets the value of the baselineStartDate property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setBaselineStartDate(LocalDateTime value)
      {
         this.baselineStartDate = value;
      }

      /**
       * Gets the value of the baselineFinishDate property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public LocalDateTime getBaselineFinishDate()
      {
         return baselineFinishDate;
      }

      /**
       * Sets the value of the baselineFinishDate property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setBaselineFinishDate(LocalDateTime value)
      {
         this.baselineFinishDate = value;
      }

      /**
       * Gets the value of the showSubtasks property.
       *
       * @return
       *     possible object is
       *     {@link Boolean }
       *
       */
      public Boolean isShowSubtasks()
      {
         return showSubtasks;
      }

      /**
       * Sets the value of the showSubtasks property.
       *
       * @param value
       *     allowed object is
       *     {@link Boolean }
       *
       */
      public void setShowSubtasks(Boolean value)
      {
         this.showSubtasks = value;
      }

      /**
       * The priority of the project.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public Priority getPriority()
      {
         return priority;
      }

      /**
       * Sets the value of the priority property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setPriority(Priority value)
      {
         this.priority = value;
      }

      /**
       * Gets the value of the isVisibleSubitems property.
       *
       * @return
       *     possible object is
       *     {@link Boolean }
       *
       */
      public Boolean isIsVisibleSubitems()
      {
         return isVisibleSubitems;
      }

      /**
       * Sets the value of the isVisibleSubitems property.
       *
       * @param value
       *     allowed object is
       *     {@link Boolean }
       *
       */
      public void setIsVisibleSubitems(Boolean value)
      {
         this.isVisibleSubitems = value;
      }

      /**
       * Gets the value of the styleProject property.
       *
       * @return
       *     possible object is
       *     {@link StyleProject }
       *
       */
      public StyleProject getStyleProject()
      {
         return styleProject;
      }

      /**
       * Sets the value of the styleProject property.
       *
       * @param value
       *     allowed object is
       *     {@link StyleProject }
       *
       */
      public void setStyleProject(StyleProject value)
      {
         this.styleProject = value;
      }

      /**
       * Gets the value of the markerID property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public Integer getMarkerID()
      {
         return markerID;
      }

      /**
       * Sets the value of the markerID property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setMarkerID(Integer value)
      {
         this.markerID = value;
      }

      /**
       * Hyperlinks associated with the project.
       *
       * @return
       *     possible object is
       *     {@link Hyperlinks }
       *
       */
      public Hyperlinks getHyperlinks()
      {
         return hyperlinks;
      }

      /**
       * Sets the value of the hyperlinks property.
       *
       * @param value
       *     allowed object is
       *     {@link Hyperlinks }
       *
       */
      public void setHyperlinks(Hyperlinks value)
      {
         this.hyperlinks = value;
      }

      /**
       * Gets the value of the completeJournalTrackingPeriod property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public Integer getCompleteJournalTrackingPeriod()
      {
         return completeJournalTrackingPeriod;
      }

      /**
       * Sets the value of the completeJournalTrackingPeriod property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setCompleteJournalTrackingPeriod(Integer value)
      {
         this.completeJournalTrackingPeriod = value;
      }

      /**
       * Gets the value of the callouts property.
       *
       * @return
       *     possible object is
       *     {@link Callouts }
       *
       */
      public Callouts getCallouts()
      {
         return callouts;
      }

      /**
       * Sets the value of the callouts property.
       *
       * @param value
       *     allowed object is
       *     {@link Callouts }
       *
       */
      public void setCallouts(Callouts value)
      {
         this.callouts = value;
      }

      /**
       * Gets the value of the ppvItems property.
       *
       * @return
       *     possible object is
       *     {@link PPVItemsType }
       *
       */
      public PPVItemsType getPPVItems()
      {
         return ppvItems;
      }

      /**
       * Sets the value of the ppvItems property.
       *
       * @param value
       *     allowed object is
       *     {@link PPVItemsType }
       *
       */
      public void setPPVItems(PPVItemsType value)
      {
         this.ppvItems = value;
      }

      /**
       * &lt;p&gt;Java class for anonymous complex type.
       *
       * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
       *
       * &lt;pre&gt;
       * &amp;lt;complexType&amp;gt;
       *   &amp;lt;complexContent&amp;gt;
       *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
       *       &amp;lt;sequence&amp;gt;
       *         &amp;lt;element name="CompleteJournalEntry" maxOccurs="unbounded" minOccurs="0"&amp;gt;
       *           &amp;lt;complexType&amp;gt;
       *             &amp;lt;complexContent&amp;gt;
       *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
       *                 &amp;lt;sequence&amp;gt;
       *                   &amp;lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
       *                   &amp;lt;element name="Complete" type="{http://www.w3.org/2001/XMLSchema}decimal"/&amp;gt;
       *                 &amp;lt;/sequence&amp;gt;
       *               &amp;lt;/restriction&amp;gt;
       *             &amp;lt;/complexContent&amp;gt;
       *           &amp;lt;/complexType&amp;gt;
       *         &amp;lt;/element&amp;gt;
       *       &amp;lt;/sequence&amp;gt;
       *     &amp;lt;/restriction&amp;gt;
       *   &amp;lt;/complexContent&amp;gt;
       * &amp;lt;/complexType&amp;gt;
       * &lt;/pre&gt;
       *
       *
       */
      @XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder =
      {
         "completeJournalEntry"
      }) public static class CompleteJournal
      {

         @XmlElement(name = "CompleteJournalEntry") protected List<PPVItemsType.PPVItem.CompleteJournal.CompleteJournalEntry> completeJournalEntry;

         /**
          * Gets the value of the completeJournalEntry property.
          *
          * &lt;p&gt;
          * This accessor method returns a reference to the live list,
          * not a snapshot. Therefore any modification you make to the
          * returned list will be present inside the JAXB object.
          * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the completeJournalEntry property.
          *
          * &lt;p&gt;
          * For example, to add a new item, do as follows:
          * &lt;pre&gt;
          *    getCompleteJournalEntry().add(newItem);
          * &lt;/pre&gt;
          *
          *
          * &lt;p&gt;
          * Objects of the following type(s) are allowed in the list
          * {@link PPVItemsType.PPVItem.CompleteJournal.CompleteJournalEntry }
          *
          *
          */
         public List<PPVItemsType.PPVItem.CompleteJournal.CompleteJournalEntry> getCompleteJournalEntry()
         {
            if (completeJournalEntry == null)
            {
               completeJournalEntry = new ArrayList<>();
            }
            return this.completeJournalEntry;
         }

         /**
          * &lt;p&gt;Java class for anonymous complex type.
          *
          * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
          *
          * &lt;pre&gt;
          * &amp;lt;complexType&amp;gt;
          *   &amp;lt;complexContent&amp;gt;
          *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
          *       &amp;lt;sequence&amp;gt;
          *         &amp;lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
          *         &amp;lt;element name="Complete" type="{http://www.w3.org/2001/XMLSchema}decimal"/&amp;gt;
          *       &amp;lt;/sequence&amp;gt;
          *     &amp;lt;/restriction&amp;gt;
          *   &amp;lt;/complexContent&amp;gt;
          * &amp;lt;/complexType&amp;gt;
          * &lt;/pre&gt;
          *
          *
          */
         @XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder =
         {
            "date",
            "complete"
         }) public static class CompleteJournalEntry
         {

            @XmlElement(name = "Date", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "date") protected LocalDate date;
            @XmlElement(name = "Complete", required = true) protected BigDecimal complete;

            /**
             * Gets the value of the date property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public LocalDate getDate()
            {
               return date;
            }

            /**
             * Sets the value of the date property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDate(LocalDate value)
            {
               this.date = value;
            }

            /**
             * Gets the value of the complete property.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getComplete()
            {
               return complete;
            }

            /**
             * Sets the value of the complete property.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setComplete(BigDecimal value)
            {
               this.complete = value;
            }

         }

      }

   }

}
