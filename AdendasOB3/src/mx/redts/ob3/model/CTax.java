package mx.redts.ob3.model;

// Generated 03-jun-2014 0:22:34 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * CTax generated by hbm2java
 */
@Entity
@Table(name = "c_tax", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = {
		"ad_client_id", "ad_org_id", "name", "parent_tax_id" }))
public class CTax implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String CTaxId;
	private CRegion CRegionByToRegionId;
	private CTax CTaxByParentTaxId;
	private AdOrg adOrg;
	private CTax CTaxByCTaxbaseId;
	private CCountry CCountryByCCountryId;
	private CRegion CRegionByCRegionId;
	private CCountry CCountryByToCountryId;
	private String adClientId;
	private char isactive;
	private Date created;
	private String createdby;
	private Date updated;
	private String name;
	private String updatedby;
	private String description;
	private String taxindicator;
	private Date validfrom;
	private char issummary;
	private BigDecimal rate;
	private String CTaxcategoryId;
	private char isdefault;
	private char istaxexempt;
	private String sopotype;
	private Character cascade;
	private String CBpTaxcategoryId;
	private BigDecimal line;
	private Character iswithholdingtax;
	private Character isnotaxable;
	private Long deducpercent;
	private Long originalrate;
	private Character istaxundeductable;
	private Character istaxdeductable;
	private Character isnovat;
	private String baseamount;
	private String doctaxamount;
	private Set<AdOrginfo> adOrginfos = new HashSet<AdOrginfo>(0);
	private Set<CInvoicetax> CInvoicetaxes = new HashSet<CInvoicetax>(0);
	private Set<CTax> CTaxesForCTaxbaseId = new HashSet<CTax>(0);
	private Set<CTax> CTaxesForParentTaxId = new HashSet<CTax>(0);
	private Set<CInvoiceline> CInvoicelines = new HashSet<CInvoiceline>(0);

	public CTax() {
	}

	public CTax(String CTaxId, AdOrg adOrg, String adClientId, char isactive,
			Date created, String createdby, Date updated, String name,
			String updatedby, Date validfrom, char issummary, BigDecimal rate,
			String CTaxcategoryId, char isdefault, char istaxexempt,
			String sopotype, String baseamount, String doctaxamount) {
		this.CTaxId = CTaxId;
		this.adOrg = adOrg;
		this.adClientId = adClientId;
		this.isactive = isactive;
		this.created = created;
		this.createdby = createdby;
		this.updated = updated;
		this.name = name;
		this.updatedby = updatedby;
		this.validfrom = validfrom;
		this.issummary = issummary;
		this.rate = rate;
		this.CTaxcategoryId = CTaxcategoryId;
		this.isdefault = isdefault;
		this.istaxexempt = istaxexempt;
		this.sopotype = sopotype;
		this.baseamount = baseamount;
		this.doctaxamount = doctaxamount;
	}

	public CTax(String CTaxId, CRegion CRegionByToRegionId,
			CTax CTaxByParentTaxId, AdOrg adOrg, CTax CTaxByCTaxbaseId,
			CCountry CCountryByCCountryId, CRegion CRegionByCRegionId,
			CCountry CCountryByToCountryId, String adClientId, char isactive,
			Date created, String createdby, Date updated, String name,
			String updatedby, String description, String taxindicator,
			Date validfrom, char issummary, BigDecimal rate,
			String CTaxcategoryId, char isdefault, char istaxexempt,
			String sopotype, Character cascade, String CBpTaxcategoryId,
			BigDecimal line, Character iswithholdingtax, Character isnotaxable,
			Long deducpercent, Long originalrate, Character istaxundeductable,
			Character istaxdeductable, Character isnovat, String baseamount,
			String doctaxamount, Set<AdOrginfo> adOrginfos,
			Set<CInvoicetax> CInvoicetaxes, Set<CTax> CTaxesForCTaxbaseId,
			Set<CTax> CTaxesForParentTaxId, Set<CInvoiceline> CInvoicelines) {
		this.CTaxId = CTaxId;
		this.CRegionByToRegionId = CRegionByToRegionId;
		this.CTaxByParentTaxId = CTaxByParentTaxId;
		this.adOrg = adOrg;
		this.CTaxByCTaxbaseId = CTaxByCTaxbaseId;
		this.CCountryByCCountryId = CCountryByCCountryId;
		this.CRegionByCRegionId = CRegionByCRegionId;
		this.CCountryByToCountryId = CCountryByToCountryId;
		this.adClientId = adClientId;
		this.isactive = isactive;
		this.created = created;
		this.createdby = createdby;
		this.updated = updated;
		this.name = name;
		this.updatedby = updatedby;
		this.description = description;
		this.taxindicator = taxindicator;
		this.validfrom = validfrom;
		this.issummary = issummary;
		this.rate = rate;
		this.CTaxcategoryId = CTaxcategoryId;
		this.isdefault = isdefault;
		this.istaxexempt = istaxexempt;
		this.sopotype = sopotype;
		this.cascade = cascade;
		this.CBpTaxcategoryId = CBpTaxcategoryId;
		this.line = line;
		this.iswithholdingtax = iswithholdingtax;
		this.isnotaxable = isnotaxable;
		this.deducpercent = deducpercent;
		this.originalrate = originalrate;
		this.istaxundeductable = istaxundeductable;
		this.istaxdeductable = istaxdeductable;
		this.isnovat = isnovat;
		this.baseamount = baseamount;
		this.doctaxamount = doctaxamount;
		this.adOrginfos = adOrginfos;
		this.CInvoicetaxes = CInvoicetaxes;
		this.CTaxesForCTaxbaseId = CTaxesForCTaxbaseId;
		this.CTaxesForParentTaxId = CTaxesForParentTaxId;
		this.CInvoicelines = CInvoicelines;
	}

	@Column(name = "ad_client_id", nullable = false, length = 32)
	public String getAdClientId() {
		return this.adClientId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ad_org_id", nullable = false)
	public AdOrg getAdOrg() {
		return this.adOrg;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "CTax")
	public Set<AdOrginfo> getAdOrginfos() {
		return this.adOrginfos;
	}

	@Column(name = "baseamount", nullable = false, length = 60)
	public String getBaseamount() {
		return this.baseamount;
	}

	@Column(name = "cascade", length = 1)
	public Character getCascade() {
		return this.cascade;
	}

	@Column(name = "c_bp_taxcategory_id", length = 32)
	public String getCBpTaxcategoryId() {
		return this.CBpTaxcategoryId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "c_country_id")
	public CCountry getCCountryByCCountryId() {
		return this.CCountryByCCountryId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "to_country_id")
	public CCountry getCCountryByToCountryId() {
		return this.CCountryByToCountryId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "CTax")
	public Set<CInvoiceline> getCInvoicelines() {
		return this.CInvoicelines;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "CTax")
	public Set<CInvoicetax> getCInvoicetaxes() {
		return this.CInvoicetaxes;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created", nullable = false, length = 29)
	public Date getCreated() {
		return this.created;
	}

	@Column(name = "createdby", nullable = false, length = 32)
	public String getCreatedby() {
		return this.createdby;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "c_region_id")
	public CRegion getCRegionByCRegionId() {
		return this.CRegionByCRegionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "to_region_id")
	public CRegion getCRegionByToRegionId() {
		return this.CRegionByToRegionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "c_taxbase_id")
	public CTax getCTaxByCTaxbaseId() {
		return this.CTaxByCTaxbaseId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_tax_id")
	public CTax getCTaxByParentTaxId() {
		return this.CTaxByParentTaxId;
	}

	@Column(name = "c_taxcategory_id", nullable = false, length = 32)
	public String getCTaxcategoryId() {
		return this.CTaxcategoryId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "CTaxByCTaxbaseId")
	public Set<CTax> getCTaxesForCTaxbaseId() {
		return this.CTaxesForCTaxbaseId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "CTaxByParentTaxId")
	public Set<CTax> getCTaxesForParentTaxId() {
		return this.CTaxesForParentTaxId;
	}

	@Id
	@Column(name = "c_tax_id", unique = true, nullable = false, length = 32)
	public String getCTaxId() {
		return this.CTaxId;
	}

	@Column(name = "deducpercent", precision = 10, scale = 0)
	public Long getDeducpercent() {
		return this.deducpercent;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	@Column(name = "doctaxamount", nullable = false, length = 60)
	public String getDoctaxamount() {
		return this.doctaxamount;
	}

	@Column(name = "isactive", nullable = false, length = 1)
	public char getIsactive() {
		return this.isactive;
	}

	@Column(name = "isdefault", nullable = false, length = 1)
	public char getIsdefault() {
		return this.isdefault;
	}

	@Column(name = "isnotaxable", length = 1)
	public Character getIsnotaxable() {
		return this.isnotaxable;
	}

	@Column(name = "isnovat", length = 1)
	public Character getIsnovat() {
		return this.isnovat;
	}

	@Column(name = "issummary", nullable = false, length = 1)
	public char getIssummary() {
		return this.issummary;
	}

	@Column(name = "istaxdeductable", length = 1)
	public Character getIstaxdeductable() {
		return this.istaxdeductable;
	}

	@Column(name = "istaxexempt", nullable = false, length = 1)
	public char getIstaxexempt() {
		return this.istaxexempt;
	}

	@Column(name = "istaxundeductable", length = 1)
	public Character getIstaxundeductable() {
		return this.istaxundeductable;
	}

	@Column(name = "iswithholdingtax", length = 1)
	public Character getIswithholdingtax() {
		return this.iswithholdingtax;
	}

	@Column(name = "line", precision = 131089, scale = 0)
	public BigDecimal getLine() {
		return this.line;
	}

	@Column(name = "name", nullable = false, length = 60)
	public String getName() {
		return this.name;
	}

	@Column(name = "originalrate", precision = 10, scale = 0)
	public Long getOriginalrate() {
		return this.originalrate;
	}

	@Column(name = "rate", nullable = false, precision = 131089, scale = 0)
	public BigDecimal getRate() {
		return this.rate;
	}

	@Column(name = "sopotype", nullable = false, length = 60)
	public String getSopotype() {
		return this.sopotype;
	}

	@Column(name = "taxindicator", length = 5)
	public String getTaxindicator() {
		return this.taxindicator;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated", nullable = false, length = 29)
	public Date getUpdated() {
		return this.updated;
	}

	@Column(name = "updatedby", nullable = false, length = 32)
	public String getUpdatedby() {
		return this.updatedby;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "validfrom", nullable = false, length = 29)
	public Date getValidfrom() {
		return this.validfrom;
	}

	public void setAdClientId(String adClientId) {
		this.adClientId = adClientId;
	}

	public void setAdOrg(AdOrg adOrg) {
		this.adOrg = adOrg;
	}

	public void setAdOrginfos(Set<AdOrginfo> adOrginfos) {
		this.adOrginfos = adOrginfos;
	}

	public void setBaseamount(String baseamount) {
		this.baseamount = baseamount;
	}

	public void setCascade(Character cascade) {
		this.cascade = cascade;
	}

	public void setCBpTaxcategoryId(String CBpTaxcategoryId) {
		this.CBpTaxcategoryId = CBpTaxcategoryId;
	}

	public void setCCountryByCCountryId(CCountry CCountryByCCountryId) {
		this.CCountryByCCountryId = CCountryByCCountryId;
	}

	public void setCCountryByToCountryId(CCountry CCountryByToCountryId) {
		this.CCountryByToCountryId = CCountryByToCountryId;
	}

	public void setCInvoicelines(Set<CInvoiceline> CInvoicelines) {
		this.CInvoicelines = CInvoicelines;
	}

	public void setCInvoicetaxes(Set<CInvoicetax> CInvoicetaxes) {
		this.CInvoicetaxes = CInvoicetaxes;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public void setCRegionByCRegionId(CRegion CRegionByCRegionId) {
		this.CRegionByCRegionId = CRegionByCRegionId;
	}

	public void setCRegionByToRegionId(CRegion CRegionByToRegionId) {
		this.CRegionByToRegionId = CRegionByToRegionId;
	}

	public void setCTaxByCTaxbaseId(CTax CTaxByCTaxbaseId) {
		this.CTaxByCTaxbaseId = CTaxByCTaxbaseId;
	}

	public void setCTaxByParentTaxId(CTax CTaxByParentTaxId) {
		this.CTaxByParentTaxId = CTaxByParentTaxId;
	}

	public void setCTaxcategoryId(String CTaxcategoryId) {
		this.CTaxcategoryId = CTaxcategoryId;
	}

	public void setCTaxesForCTaxbaseId(Set<CTax> CTaxesForCTaxbaseId) {
		this.CTaxesForCTaxbaseId = CTaxesForCTaxbaseId;
	}

	public void setCTaxesForParentTaxId(Set<CTax> CTaxesForParentTaxId) {
		this.CTaxesForParentTaxId = CTaxesForParentTaxId;
	}

	public void setCTaxId(String CTaxId) {
		this.CTaxId = CTaxId;
	}

	public void setDeducpercent(Long deducpercent) {
		this.deducpercent = deducpercent;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDoctaxamount(String doctaxamount) {
		this.doctaxamount = doctaxamount;
	}

	public void setIsactive(char isactive) {
		this.isactive = isactive;
	}

	public void setIsdefault(char isdefault) {
		this.isdefault = isdefault;
	}

	public void setIsnotaxable(Character isnotaxable) {
		this.isnotaxable = isnotaxable;
	}

	public void setIsnovat(Character isnovat) {
		this.isnovat = isnovat;
	}

	public void setIssummary(char issummary) {
		this.issummary = issummary;
	}

	public void setIstaxdeductable(Character istaxdeductable) {
		this.istaxdeductable = istaxdeductable;
	}

	public void setIstaxexempt(char istaxexempt) {
		this.istaxexempt = istaxexempt;
	}

	public void setIstaxundeductable(Character istaxundeductable) {
		this.istaxundeductable = istaxundeductable;
	}

	public void setIswithholdingtax(Character iswithholdingtax) {
		this.iswithholdingtax = iswithholdingtax;
	}

	public void setLine(BigDecimal line) {
		this.line = line;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOriginalrate(Long originalrate) {
		this.originalrate = originalrate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public void setSopotype(String sopotype) {
		this.sopotype = sopotype;
	}

	public void setTaxindicator(String taxindicator) {
		this.taxindicator = taxindicator;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public void setValidfrom(Date validfrom) {
		this.validfrom = validfrom;
	}

}