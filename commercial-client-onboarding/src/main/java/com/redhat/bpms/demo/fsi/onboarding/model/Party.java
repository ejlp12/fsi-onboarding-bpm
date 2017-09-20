package com.redhat.bpms.demo.fsi.onboarding.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "Party")
public class Party implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.Id
   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "PARTY_ID_GENERATOR")
   @javax.persistence.SequenceGenerator(sequenceName = "PARTY_ID_SEQ", name = "PARTY_ID_GENERATOR")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label(value = "Name")
   private java.lang.String name;

   @org.kie.api.definition.type.Label(value = "Surname")
   private java.lang.String surname;

   @org.kie.api.definition.type.Label(value = "Date of Birth")
   private java.util.Date dateOfBirth;

   @org.kie.api.definition.type.Label(value = "Social Security Number")
   private java.lang.String ssn;

   public Party()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getSurname()
   {
      return this.surname;
   }

   public void setSurname(java.lang.String surname)
   {
      this.surname = surname;
   }

   public java.util.Date getDateOfBirth()
   {
      return this.dateOfBirth;
   }

   public void setDateOfBirth(java.util.Date dateOfBirth)
   {
      this.dateOfBirth = dateOfBirth;
   }

   public java.lang.String getSsn()
   {
      return this.ssn;
   }

   public void setSsn(java.lang.String ssn)
   {
      this.ssn = ssn;
   }

   public Party(java.lang.Long id, java.lang.String name,
         java.lang.String surname, java.util.Date dateOfBirth,
         java.lang.String ssn)
   {
      this.id = id;
      this.name = name;
      this.surname = surname;
      this.dateOfBirth = dateOfBirth;
      this.ssn = ssn;
   }

}