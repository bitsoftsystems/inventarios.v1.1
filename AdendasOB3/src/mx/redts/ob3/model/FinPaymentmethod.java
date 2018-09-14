package mx.redts.ob3.model;

// Generated 03-jun-2014 0:22:34 by Hibernate Tools 3.4.0.CR1

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

/**
 * FinPaymentmethod generated by hbm2java
 */
@Entity
@Table(name = "fin_paymentmethod", schema = "public")
public class FinPaymentmethod implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String finPaymentmethodId;
	private AdOrg adOrg;
	private String adClientId;
	private Date created;
	private String createdby;
	private Date updated;
	private String updatedby;
	private Character isactive;
	private String name;
	private String description;
	private char automaticReceipt;
	private char automaticPayment;
	private char automaticDeposit;
	private char automaticWithdrawn;
	private char payinAllow;
	private char payoutAllow;
	private String payinExecutionType;
	private String payoutExecutionType;
	private String payinExecutionProcessId;
	private String payoutExecutionProcessId;
	private char payinDeferred;
	private char payoutDeferred;
	private String uponreceiptuse;
	private String upondeposituse;
	private String inuponclearinguse;
	private String uponpaymentuse;
	private String uponwithdrawaluse;
	private String outuponclearinguse;
	private char payinIsmulticurrency;
	private char payoutIsmulticurrency;
	private Set<CBpartner> CBpartnersForPoPaymentmethodId = new HashSet<CBpartner>(
			0);
	private Set<CInvoice> CInvoices = new HashSet<CInvoice>(0);
	private Set<COrder> COrders = new HashSet<COrder>(0);
	private Set<CBpartner> CBpartnersForFinPaymentmethodId = new HashSet<CBpartner>(
			0);

	public FinPaymentmethod() {
	}

	public FinPaymentmethod(String finPaymentmethodId, AdOrg adOrg,
			String adClientId, Date created, String createdby, Date updated,
			String updatedby, Character isactive, String name,
			String description, char automaticReceipt, char automaticPayment,
			char automaticDeposit, char automaticWithdrawn, char payinAllow,
			char payoutAllow, String payinExecutionType,
			String payoutExecutionType, String payinExecutionProcessId,
			String payoutExecutionProcessId, char payinDeferred,
			char payoutDeferred, String uponreceiptuse, String upondeposituse,
			String inuponclearinguse, String uponpaymentuse,
			String uponwithdrawaluse, String outuponclearinguse,
			char payinIsmulticurrency, char payoutIsmulticurrency,
			Set<CBpartner> CBpartnersForPoPaymentmethodId,
			Set<CInvoice> CInvoices, Set<COrder> COrders,
			Set<CBpartner> CBpartnersForFinPaymentmethodId) {
		this.finPaymentmethodId = finPaymentmethodId;
		this.adOrg = adOrg;
		this.adClientId = adClientId;
		this.created = created;
		this.createdby = createdby;
		this.updated = updated;
		this.updatedby = updatedby;
		this.isactive = isactive;
		this.name = name;
		this.description = description;
		this.automaticReceipt = automaticReceipt;
		this.automaticPayment = automaticPayment;
		this.automaticDeposit = automaticDeposit;
		this.automaticWithdrawn = automaticWithdrawn;
		this.payinAllow = payinAllow;
		this.payoutAllow = payoutAllow;
		this.payinExecutionType = payinExecutionType;
		this.payoutExecutionType = payoutExecutionType;
		this.payinExecutionProcessId = payinExecutionProcessId;
		this.payoutExecutionProcessId = payoutExecutionProcessId;
		this.payinDeferred = payinDeferred;
		this.payoutDeferred = payoutDeferred;
		this.uponreceiptuse = uponreceiptuse;
		this.upondeposituse = upondeposituse;
		this.inuponclearinguse = inuponclearinguse;
		this.uponpaymentuse = uponpaymentuse;
		this.uponwithdrawaluse = uponwithdrawaluse;
		this.outuponclearinguse = outuponclearinguse;
		this.payinIsmulticurrency = payinIsmulticurrency;
		this.payoutIsmulticurrency = payoutIsmulticurrency;
		this.CBpartnersForPoPaymentmethodId = CBpartnersForPoPaymentmethodId;
		this.CInvoices = CInvoices;
		this.COrders = COrders;
		this.CBpartnersForFinPaymentmethodId = CBpartnersForFinPaymentmethodId;
	}

	public FinPaymentmethod(String finPaymentmethodId, AdOrg adOrg,
			String adClientId, Date created, String createdby, Date updated,
			String updatedby, String name, char automaticReceipt,
			char automaticPayment, char automaticDeposit,
			char automaticWithdrawn, char payinAllow, char payoutAllow,
			String payinExecutionType, String payoutExecutionType,
			char payinDeferred, char payoutDeferred, char payinIsmulticurrency,
			char payoutIsmulticurrency) {
		this.finPaymentmethodId = finPaymentmethodId;
		this.adOrg = adOrg;
		this.adClientId = adClientId;
		this.created = created;
		this.createdby = createdby;
		this.updated = updated;
		this.updatedby = updatedby;
		this.name = name;
		this.automaticReceipt = automaticReceipt;
		this.automaticPayment = automaticPayment;
		this.automaticDeposit = automaticDeposit;
		this.automaticWithdrawn = automaticWithdrawn;
		this.payinAllow = payinAllow;
		this.payoutAllow = payoutAllow;
		this.payinExecutionType = payinExecutionType;
		this.payoutExecutionType = payoutExecutionType;
		this.payinDeferred = payinDeferred;
		this.payoutDeferred = payoutDeferred;
		this.payinIsmulticurrency = payinIsmulticurrency;
		this.payoutIsmulticurrency = payoutIsmulticurrency;
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

	@Column(name = "automatic_deposit", nullable = false, length = 1)
	public char getAutomaticDeposit() {
		return this.automaticDeposit;
	}

	@Column(name = "automatic_payment", nullable = false, length = 1)
	public char getAutomaticPayment() {
		return this.automaticPayment;
	}

	@Column(name = "automatic_receipt", nullable = false, length = 1)
	public char getAutomaticReceipt() {
		return this.automaticReceipt;
	}

	@Column(name = "automatic_withdrawn", nullable = false, length = 1)
	public char getAutomaticWithdrawn() {
		return this.automaticWithdrawn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "finPaymentmethodByFinPaymentmethodId")
	public Set<CBpartner> getCBpartnersForFinPaymentmethodId() {
		return this.CBpartnersForFinPaymentmethodId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "finPaymentmethodByPoPaymentmethodId")
	public Set<CBpartner> getCBpartnersForPoPaymentmethodId() {
		return this.CBpartnersForPoPaymentmethodId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "finPaymentmethod")
	public Set<CInvoice> getCInvoices() {
		return this.CInvoices;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "finPaymentmethod")
	public Set<COrder> getCOrders() {
		return this.COrders;
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

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	@Id
	@Column(name = "fin_paymentmethod_id", unique = true, nullable = false, length = 32)
	public String getFinPaymentmethodId() {
		return this.finPaymentmethodId;
	}

	@Column(name = "inuponclearinguse", length = 60)
	public String getInuponclearinguse() {
		return this.inuponclearinguse;
	}

	@Column(name = "isactive", length = 1)
	public Character getIsactive() {
		return this.isactive;
	}

	@Column(name = "name", nullable = false, length = 60)
	public String getName() {
		return this.name;
	}

	@Column(name = "outuponclearinguse", length = 60)
	public String getOutuponclearinguse() {
		return this.outuponclearinguse;
	}

	@Column(name = "payin_allow", nullable = false, length = 1)
	public char getPayinAllow() {
		return this.payinAllow;
	}

	@Column(name = "payin_deferred", nullable = false, length = 1)
	public char getPayinDeferred() {
		return this.payinDeferred;
	}

	@Column(name = "payin_execution_process_id", length = 32)
	public String getPayinExecutionProcessId() {
		return this.payinExecutionProcessId;
	}

	@Column(name = "payin_execution_type", nullable = false, length = 60)
	public String getPayinExecutionType() {
		return this.payinExecutionType;
	}

	@Column(name = "payin_ismulticurrency", nullable = false, length = 1)
	public char getPayinIsmulticurrency() {
		return this.payinIsmulticurrency;
	}

	@Column(name = "payout_allow", nullable = false, length = 1)
	public char getPayoutAllow() {
		return this.payoutAllow;
	}

	@Column(name = "payout_deferred", nullable = false, length = 1)
	public char getPayoutDeferred() {
		return this.payoutDeferred;
	}

	@Column(name = "payout_execution_process_id", length = 32)
	public String getPayoutExecutionProcessId() {
		return this.payoutExecutionProcessId;
	}

	@Column(name = "payout_execution_type", nullable = false, length = 60)
	public String getPayoutExecutionType() {
		return this.payoutExecutionType;
	}

	@Column(name = "payout_ismulticurrency", nullable = false, length = 1)
	public char getPayoutIsmulticurrency() {
		return this.payoutIsmulticurrency;
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

	@Column(name = "upondeposituse", length = 60)
	public String getUpondeposituse() {
		return this.upondeposituse;
	}

	@Column(name = "uponpaymentuse", length = 60)
	public String getUponpaymentuse() {
		return this.uponpaymentuse;
	}

	@Column(name = "uponreceiptuse", length = 60)
	public String getUponreceiptuse() {
		return this.uponreceiptuse;
	}

	@Column(name = "uponwithdrawaluse", length = 60)
	public String getUponwithdrawaluse() {
		return this.uponwithdrawaluse;
	}

	public void setAdClientId(String adClientId) {
		this.adClientId = adClientId;
	}

	public void setAdOrg(AdOrg adOrg) {
		this.adOrg = adOrg;
	}

	public void setAutomaticDeposit(char automaticDeposit) {
		this.automaticDeposit = automaticDeposit;
	}

	public void setAutomaticPayment(char automaticPayment) {
		this.automaticPayment = automaticPayment;
	}

	public void setAutomaticReceipt(char automaticReceipt) {
		this.automaticReceipt = automaticReceipt;
	}

	public void setAutomaticWithdrawn(char automaticWithdrawn) {
		this.automaticWithdrawn = automaticWithdrawn;
	}

	public void setCBpartnersForFinPaymentmethodId(
			Set<CBpartner> CBpartnersForFinPaymentmethodId) {
		this.CBpartnersForFinPaymentmethodId = CBpartnersForFinPaymentmethodId;
	}

	public void setCBpartnersForPoPaymentmethodId(
			Set<CBpartner> CBpartnersForPoPaymentmethodId) {
		this.CBpartnersForPoPaymentmethodId = CBpartnersForPoPaymentmethodId;
	}

	public void setCInvoices(Set<CInvoice> CInvoices) {
		this.CInvoices = CInvoices;
	}

	public void setCOrders(Set<COrder> COrders) {
		this.COrders = COrders;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFinPaymentmethodId(String finPaymentmethodId) {
		this.finPaymentmethodId = finPaymentmethodId;
	}

	public void setInuponclearinguse(String inuponclearinguse) {
		this.inuponclearinguse = inuponclearinguse;
	}

	public void setIsactive(Character isactive) {
		this.isactive = isactive;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOutuponclearinguse(String outuponclearinguse) {
		this.outuponclearinguse = outuponclearinguse;
	}

	public void setPayinAllow(char payinAllow) {
		this.payinAllow = payinAllow;
	}

	public void setPayinDeferred(char payinDeferred) {
		this.payinDeferred = payinDeferred;
	}

	public void setPayinExecutionProcessId(String payinExecutionProcessId) {
		this.payinExecutionProcessId = payinExecutionProcessId;
	}

	public void setPayinExecutionType(String payinExecutionType) {
		this.payinExecutionType = payinExecutionType;
	}

	public void setPayinIsmulticurrency(char payinIsmulticurrency) {
		this.payinIsmulticurrency = payinIsmulticurrency;
	}

	public void setPayoutAllow(char payoutAllow) {
		this.payoutAllow = payoutAllow;
	}

	public void setPayoutDeferred(char payoutDeferred) {
		this.payoutDeferred = payoutDeferred;
	}

	public void setPayoutExecutionProcessId(String payoutExecutionProcessId) {
		this.payoutExecutionProcessId = payoutExecutionProcessId;
	}

	public void setPayoutExecutionType(String payoutExecutionType) {
		this.payoutExecutionType = payoutExecutionType;
	}

	public void setPayoutIsmulticurrency(char payoutIsmulticurrency) {
		this.payoutIsmulticurrency = payoutIsmulticurrency;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public void setUpondeposituse(String upondeposituse) {
		this.upondeposituse = upondeposituse;
	}

	public void setUponpaymentuse(String uponpaymentuse) {
		this.uponpaymentuse = uponpaymentuse;
	}

	public void setUponreceiptuse(String uponreceiptuse) {
		this.uponreceiptuse = uponreceiptuse;
	}

	public void setUponwithdrawaluse(String uponwithdrawaluse) {
		this.uponwithdrawaluse = uponwithdrawaluse;
	}

}