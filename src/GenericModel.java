package empty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenericModel {
	
	

}



public class Account {

    @JsonProperty("registration")
    private String registration;
    
    @JsonProperty("type")
    private String type;
    
    @JsonProperty("CountryCode")
    private String countryCode;

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

    
    
    // Getters and setters
}


package empty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {

    @JsonProperty("streetAddress")
    private String streetAddress;
    
    @JsonProperty("streetAddress2")
    private String streetAddress2;
    
    @JsonProperty("city")
    private String city;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("region")
    private String region;
    
    @JsonProperty("zip")
    private String zip;
    
    @JsonProperty("country")
    private String country;

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getStreetAddress2() {
		return streetAddress2;
	}

	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
    
    

    // Getters and setters
}

package empty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Channel {

    @JsonProperty("languageCode")
    private String languageCode;
    
    @JsonProperty("type")
    private String type;
    
    @JsonProperty("SpsInfo")
    private SpsInfo spsInfo;

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public SpsInfo getSpsInfo() {
		return spsInfo;
	}

	public void setSpsInfo(SpsInfo spsInfo) {
		this.spsInfo = spsInfo;
	}

    
}


package empty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = "{\n"
        		+ "  \"handoffType\": \"ProspectSession\",\n"
        		+ "  \"account\": {\n"
        		+ "    \"registration\": \"IN\",\n"
        		+ "    \"type\": \"S1\",\n"
        		+ "    \"CountryCode\": \"US\"\n"
        		+ "  },\n"
        		+ "  \"party\": [\n"
        		+ "    {\n"
        		+ "      \"emailAddress\": \"generic@anywhere.com\",\n"
        		+ "      \"PersonalInfo\": {\n"
        		+ "        \"FirstName\": \"TestFirst\",\n"
        		+ "        \"LastName\": \"TestLast\",\n"
        		+ "        \"MiddleName\": \"A\",\n"
        		+ "        \"Citizenship\": \"USA\",\n"
        		+ "        \"SecondaryCitizenship\": \"CAN\",\n"
        		+ "        \"TaxId\": \"123-12-1212\",\n"
        		+ "        \"TaxIdType\": \"SSN\",\n"
        		+ "        \"DateOfBirth\": \"1998-09-09\"\n"
        		+ "      },\n"
        		+ "      \"mobilePhoneNumber\": {\n"
        		+ "        \"phoneNumber\": \"52165834\",\n"
        		+ "        \"countryCode\": \"1\",\n"
        		+ "        \"isInternational\": false\n"
        		+ "      },\n"
        		+ "      \"homeAddress\": {\n"
        		+ "        \"streetAddress\": \"123 Main St\",\n"
        		+ "        \"streetAddress2\": \"Apt 4B\",\n"
        		+ "        \"city\": \"Austin\",\n"
        		+ "        \"state\": \"TX\",\n"
        		+ "        \"region\": \"\",\n"
        		+ "        \"zip\": \"78628\",\n"
        		+ "        \"country\": \"US\"\n"
        		+ "      },\n"
        		+ "      \"businessAddress\": {\n"
        		+ "        \"streetAddress\": \"456 Corporate Blvd\",\n"
        		+ "        \"streetAddress2\": \"Suite 300\",\n"
        		+ "        \"city\": \"Austin\",\n"
        		+ "        \"state\": \"TX\",\n"
        		+ "        \"region\": \"\",\n"
        		+ "        \"zip\": \"78628\",\n"
        		+ "        \"country\": \"US\"\n"
        		+ "      }\n"
        		+ "    }\n"
        		+ "  ],\n"
        		+ "  \"channel\": {\n"
        		+ "    \"languageCode\": \"EN\",\n"
        		+ "    \"type\": \"SPS\",\n"
        		+ "    \"SpsInfo\": {\n"
        		+ "      \"ParticipantId\": \"1234\",\n"
        		+ "      \"FlexCommissionCd\": \"\",\n"
        		+ "      \"SourceCd\": \"SP\",\n"
        		+ "      \"Symbol\": \"AAPL\",\n"
        		+ "      \"EmployeeId\": \"5678\",\n"
        		+ "      \"IsAffiliate\": true,\n"
        		+ "      \"IsExpat\": false,\n"
        		+ "      \"IsNoMatch\": true\n"
        		+ "    }\n"
        		+ "  }\n"
        		+ "}"; // your JSON string here
        
        try {
            CIRequest request = objectMapper.readValue(jsonString, CIRequest.class);
            System.out.println(request.getAccount().getType());
            System.out.println(request.getChannel().getType());
            // Now `request` contains the parsed data
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package empty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonalInfo {

    @JsonProperty("FirstName")
    private String firstName;
    
    @JsonProperty("LastName")
    private String lastName;
    
    @JsonProperty("MiddleName")
    private String middleName;
    
    @JsonProperty("Citizenship")
    private String citizenship;
    
    @JsonProperty("SecondaryCitizenship")
    private String secondaryCitizenship;
    
    @JsonProperty("TaxId")
    private String taxId;
    
    @JsonProperty("TaxIdType")
    private String taxIdType;
    
    @JsonProperty("DateOfBirth")
    private String dateOfBirth;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getSecondaryCitizenship() {
		return secondaryCitizenship;
	}

	public void setSecondaryCitizenship(String secondaryCitizenship) {
		this.secondaryCitizenship = secondaryCitizenship;
	}

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public String getTaxIdType() {
		return taxIdType;
	}

	public void setTaxIdType(String taxIdType) {
		this.taxIdType = taxIdType;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

    
}

package empty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneNumber {

    @JsonProperty("phoneNumber")
    private String phoneNumber;
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    @JsonProperty("isInternational")
    private boolean isInternational;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public boolean isInternational() {
		return isInternational;
	}

	public void setInternational(boolean isInternational) {
		this.isInternational = isInternational;
	}

  
}

package empty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpsInfo {

    @JsonProperty("ParticipantId")
    private String participantId;
    
    @JsonProperty("FlexCommissionCd")
    private String flexCommissionCd;
    
    @JsonProperty("SourceCd")
    private String sourceCd;
    
    @JsonProperty("Symbol")
    private String symbol;
    
    @JsonProperty("EmployeeId")
    private String employeeId;
    
    @JsonProperty("IsAffiliate")
    private boolean isAffiliate;
    
    @JsonProperty("IsExpat")
    private boolean isExpat;
    
    @JsonProperty("IsNoMatch")
    private boolean isNoMatch;

    // Getters and setters
}

