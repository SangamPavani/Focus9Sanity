package com.focus.Pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class PDCPage extends BaseEngine
{
	@FindBy(xpath="//a[@id='2001']//span[contains(text(),'Cash and Bank')]")
	private static WebElement  cashAndBankMenu; 

	@FindBy(xpath="//a[@id='2002']//span[contains(text(),'Receipts')]")
	private static WebElement  receiptsVoucher;

	@FindBy(xpath="//a[@id='2003']//span[contains(text(),'Payments')]")
	private static WebElement  paymentsVoucher;

	@FindBy(xpath="//span[contains(text(),'Payments VAT')]")
	private static WebElement  paymentsVATVoucher;

	@FindBy(xpath="//span[contains(text(),'Receipts VAT')]")
	private static WebElement  recepitsVATVoucher;

	@FindBy(xpath="//span[contains(text(),'JV VAT View')]")
	private static WebElement  JVVATViewVoucher;


	//WEB ELEMENTS
	@FindBy(xpath="//*[@id='61']/span")
	private static WebElement  financialsTransactionMenu;

	@FindBy(xpath="//a[@class='transaction_viewname_anchor font-5']")
	private static WebElement  pendingBillsBtn;

	@FindBy(xpath="//tr[@id='trRender_1']//td//input")
	private static WebElement  pendingBillsGridRow1Chkbox;

	@FindBy(xpath="//tr[@id='trRender_2']//td//input")
	private static WebElement  pendingBillsGridRow2Chkbox;

	@FindBy(xpath="//tr[@id='trRender_3']//td//input")
	private static WebElement  pendingBillsGridRow3Chkbox;	






	@FindBy(xpath="//li[@id='navigationtab2']//span[contains(text(),'Miscellaneous')]")
	private static WebElement settingMiscellaneousTab;

	@FindBy(xpath="//select[@id='misc_CurrencyAddCurrencyIn']")
	private static WebElement miscAddCurrencyDropdown;

	@FindBy(xpath="//input[@id='misc_currencyInputExchangeRate']")
	private static WebElement miscInputExchangeRateChkbox;

	@FindBy(xpath="//input[@id='misc_currencyInputLocalExchangeRate']")
	private static WebElement miscInputLocalExchangeRateChkbox;

	@FindBy(xpath="//select[@id='misc_arapDueDate']")
	private static WebElement miscDueDateDropdown;



	@FindBy(xpath="//span[@id='updateButton']")
	private static WebElement settingUpdateIcon;

	@FindBy(xpath="//i[@class='icon-close icon-font6']")
	private static WebElement settingCloseIcon;


	@FindBy(xpath="//label[contains(text(),'Copy Document')]")
	private static WebElement CopyDocumentBtn;

	@FindBy(xpath="//label[contains(text(),'Copy to Clipboard')]")
	private static WebElement copytoClipboardBtn;

	@FindBy(xpath="//label[contains(text(),'Paste from Clipboard')]")
	private static WebElement pastefromClipboardBtn;

	@FindBy(xpath="//label[contains(text(),'Raise a Cheque Return')]")
	private static WebElement raiseaChequeReturnBtn;

	@FindBy(xpath="//label[contains(text(),'Add To Stock')]")
	private static WebElement addToStockBtn;

	@FindBy(xpath="//label[contains(text(),'Posting details')]")
	private static WebElement postingDetailsBtn;

	@FindBy(xpath="//label[contains(text(),'Reverse Entry')]")
	private static WebElement reversEntryBtn;

	@FindBy(xpath="//label[contains(text(),'Export to XML')]")
	private static WebElement exporttoXMLBtn;

	@FindBy(xpath="//label[contains(text(),'Setting')]")
	private static WebElement settingBtn;

	@FindBy(xpath="//label[contains(text(),'Calculator')]")
	private static WebElement calculatorBtn;

	@FindBy(xpath="//label[contains(text(),'Auto Load')]")
	private static WebElement autoLoadBtn;



	//Vouchers Home Page Ribbon Control
	@FindBy(xpath="//div[@id='myNavbar']//span[@class='icon-new icon-font6']")
	private static WebElement  newBtn;

	@FindBy(xpath="//div[@id='id_transaction_homescreen_edit']//span[@class='icon-edit icon-font6 ImagesinArabic']")
	private static WebElement  editBtn;

	@FindBy(xpath="//span[@class='icon-print icon-font6']")
	private static WebElement  printBtn;

	@FindBy(xpath="//div[@id='id_transaction_homescreen_Delete']//span[@class='icon-delete icon-font6']")
	private static WebElement  deleteBtn;

	@FindBy(xpath="//span[@class='icon-authorize icon-font6']")
	private static WebElement  authorizeBtn;

	@FindBy(xpath="//span[@class='icon-suspend icon-font6']")
	private static WebElement  suspendBtn;

	@FindBy(xpath="//span[@class='icon-reject2 icon-font6']")
	private static WebElement  rejectBtn;

	@FindBy(xpath="//span[@class='icon-cheque icon-font6']")
	private static WebElement  chequeReturnBtn;

	@FindBy(xpath="//span[@class='icon-printbarcode icon-font6']")
	private static WebElement  printBarCodeBtn;

	@FindBy(xpath="//span[@class='icon-convert icon-font6']")
	private static WebElement  convertBtn;

	@FindBy(xpath="//span[@class='icon-export icon-font6']")
	private static WebElement  exportToXMLBtn;  

	@FindBy(xpath="//div[@id='myNavbar']//span[@class='icon-settings icon-font6']")
	private static WebElement  settingsBtn;

	@FindBy(xpath="//div[@id='dvHomeTransClose']//span[@class='icon-close icon-font6']")  
	private static WebElement  homeCloseBtn;

	//Vouchers Home Page Options
	@FindBy(xpath="//*[@id='id_transaction_viewcontainer']/li[1]/a")
	private static WebElement  allVouchersOption;

	@FindBy(xpath="//a[@class='transaction_viewname_anchor font-5']")
	private static WebElement  pendingBillsOption;

	@FindBy(xpath="//input[@id='SelectDefaultView']")
	private static WebElement  selectDefaultViewChkBox;

	@FindBy(xpath="//span[@class='icon-sorting icon-font6 toolbar_button_image theme_button_color dropdown-toggle']")
	private static WebElement  sortingBtn;

	@FindBy(xpath="//div[@id='btnCreateView']//span[@class='icon-new icon-font6']")
	private static WebElement  createViewBtn;

	@FindBy(xpath="//div[@id='btnCustomize']//span[@class='icon-settings icon-font6']")
	private static WebElement  customizeBtn;

	@FindBy(xpath="//span[@class='icon-filter icon-font6']")
	private static WebElement  filterBtn;

	/* @FindBy(xpath="//span[@id='reportRefresh']")
   private static WebElement  refreshBtn;*/


	@FindBy(xpath="//span[@id='transhomeRefresh']")
	private static WebElement  refreshBtn;






	@FindBy(xpath="//i[@class='icon-font6 icon-export']")
	private static WebElement  exportBtn;


	// Options Button  (Display Option)	
	@FindBy(xpath="//span[@id='transOptions']")
	private static WebElement  optionsBtn;

	@FindBy(xpath="//a[contains(text(),'Auto Adjust Width')]")
	private static WebElement  autoAdjustWidthBtn;

	@FindBy(xpath="//a[contains(text(),'Fit To Screen')]")
	private static WebElement  fitToScreenBtn;

	@FindBy(xpath="//a[contains(text(),'Normal')]")
	private static WebElement  normalBtn;


	//Voucher Home Page Grid Header Columns
	@FindBy(xpath="//input[@id='HeaderChkBox']")
	private static WebElement  grid_HeaderChkBox;	

	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[3]")
	private static WebElement  grid_Header_Date;

	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[4]")
	private static WebElement  grid_Header_VoucherNumber;

	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[5]")
	private static WebElement  grid_Header_CreatedBy;

	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[6]")
	private static WebElement  grid_Header_ModifiedBy;

	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[7]")
	private static WebElement  grid_Header_CreatedDate;

	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[8]")
	private static WebElement  grid_Header_ModifiedDate;

	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[9]")
	private static WebElement  grid_Header_CreatedTime;

	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[10]")
	private static WebElement  grid_Header_ModifiedTime;

	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[11]")
	private static WebElement  grid_Header_Suspended;

	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[12]")
	private static WebElement  grid_Header_Cancelled;

	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[13]")
	private static WebElement  grid_Header_AuthorizationStatus;


	//Grid Voucher DetailsBtn
	@FindBy(xpath="//tr[@id='trRender_1']//i[@class='icon-info icon-font7']")
	private static WebElement  grid_VoucherDetailsBtn1;

	@FindBy(xpath="//tr[@id='trRender_2']//i[@class='icon-info icon-font7']")
	private static WebElement  grid_VoucherDetailsBtn2;


	//Grid CheckBox 1 And 2

	@FindBy(xpath="//tr[@id='trRender_1']//td//input")
	private static WebElement  grid_ChkBox1;

	@FindBy(xpath="//tr[@id='trRender_2']//td//input")
	private static WebElement  grid_ChkBox2;

	@FindBy(xpath="//tr[@id='trRender_3']//td//input")
	private static WebElement  grid_ChkBox3;

	@FindBy(xpath="//tr[@id='trRender_4']//td//input")
	private static WebElement  grid_ChkBox4;


	// Vouchers Home Page Footer
	@FindBy(xpath="//div[@id='tblFooterReportRender']//input[@id='txtSearch']")
	private static WebElement  searchField;

	@FindBy(xpath="//button[@id='frstPage']")
	private static WebElement  firstPageBtn;

	@FindBy(xpath="//button[@id='id_previousPage']")
	private static WebElement  previousPageBtn;

	@FindBy(xpath="//button[@id='id_pagenumber']")
	private static WebElement  currentPageNo;

	@FindBy(xpath="//button[@id='id_nextPage']")
	private static WebElement  nextPageBtn;

	@FindBy(xpath="//button[@id='lstPage']")
	private static WebElement  lastPageBtn;



	//Vouchers Entry Page Ribbon Control Options
	@FindBy(xpath="//span[@class='icon-scroll icon-font6']")
	private static WebElement  freeFlowBtn;

	@FindBy(xpath="//span[@class='icon-header icon-font6']")
	private static WebElement  jumpToHeaderSectionBtn;

	@FindBy(xpath="//span[@class='icon-panel icon-font6']")
	private static WebElement  jumpToBodySectionBtn;

	@FindBy(xpath="//span[@class='icon-footer icon-font6']")
	private static WebElement  jumpToFooterBtn;

	@FindBy(xpath="//*[@id='id_transactionentry_new']")
	private static WebElement  new_newBtn;

	@FindBy(xpath="//*[@id='id_transactionentry_save']/div[2]")
	private static WebElement  saveBtn;

	@FindBy(xpath="//*[@id='id_transactionentry_previous']")
	private static WebElement  previousBtn;

	@FindBy(xpath="//*[@id='id_transactionentry_next']")
	private static WebElement  nextBtn;

	@FindBy(xpath="//*[@id='id_transactionentry_print']")
	private static WebElement  new_PrintBtn;

	@FindBy(xpath="//*[@id='id_transactionentry_suspend']")
	private static WebElement  new_SuspendBtn;

	@FindBy(xpath="//*[@id='id_transactionentry_close']")
	private static WebElement  new_CloseBtn;

	@FindBy(xpath="//div[@id='id_transactionentry_delete']//span[contains(@class,'icon-delete icon-font6')]")
	private static WebElement  new_DeleteBtn;

	@FindBy(xpath="//span[@class='icon-menu icon-font4']")
	private static WebElement  toggleBtn;

	@FindBy(xpath="//*[@id='id_transactionentry_copydocument']")
	private static WebElement  copyDocumentOption;

	@FindBy(xpath="//*[@id='id_transactionentry_copytoclipboard']")
	private static WebElement  copyToClipBoardOption;

	@FindBy(xpath="//*[@id='id_transactionentry_pastefromclipboard']")
	private static WebElement  pasteFromClipBoardOption;

	@FindBy(xpath="//*[@id='id_transactionentry_raisechequereturn']")
	private static WebElement  raiseCheckReturnOption;

	@FindBy(xpath="//*[@id='id_transactionentry_addtostock']")
	private static WebElement  addToStockOption;

	@FindBy(xpath="//*[@id='id_transactionentry_markconvert']")
	private static WebElement  markConvertedOption;

	@FindBy(xpath="//*[@id='id_transactionentry_bominput']")
	private static WebElement  bOMinputOption;

	@FindBy(xpath="//*[@id='id_transactionentry_autoallocate']")
	private static WebElement  autoAllocateOption;

	@FindBy(xpath="//*[@id='id_transactionentry_reverseentry']")
	private static WebElement  reverseEntryOption;

	@FindBy(xpath="//*[@id='id_transactionentry_printbarcode']")
	private static WebElement  printBarCodeOption;

	@FindBy(xpath="//*[@id='id_transactionentry_postingdetails']")
	private static WebElement  postingDetailsOption;

	@FindBy(xpath="//*[@id='id_transactionentry_exporttoxml']")
	private static WebElement  exportToXMLOption;

	@FindBy(xpath="//*[@id='id_transactionentry_settings']")
	private static WebElement  settingsOption;



	//Voucher Entry Page Header Fields
	@FindBy(xpath="//input[@id='id_header_1']")
	private static WebElement  documentNumberTxt;

	@FindBy(xpath="//*[@id='id_header_1_input_image']/span")
	private static WebElement  documentNumberdropdown_ExpansionBtn;

	@FindBy(xpath="//input[@id='id_header_2']")
	private static WebElement  dateTxt;

	@FindBy(xpath="//td[@id='id_header_2_input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
	private static WebElement  dateTxt_CalenderBtn;

	@FindBy(xpath="//tr[@id='id_header_2_day_today']//span[@class='theme_color-inverse'][contains(text(),'Today')]")
	private static WebElement  calender_TodayBtn;

	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  caskBankAccountTxt;

	@FindBy(xpath="//*[@id='id_header_4_input_image']/span")
	private static WebElement  caskBankAccount_ExpansionBtn;

	@FindBy(xpath="//*[@id='id_header_4_input_settings']/span")
	private static WebElement  cashBankAccount_SettingsBtn;

	@FindBy(xpath="//div[@id='id_header_4_customize_popup_container']")
	private static WebElement  cashBankAccount_Settings_Container;

	@FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
	private static WebElement  cashBankAccount_Settings_StandardFieldsBtn;

	@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_list']")
	private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_header']")
	private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_alignment']")
	private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_width']")
	private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_CancelBtn;


	@FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]")
	private static WebElement  cashBankAccount_Settings_DeleteColumnBtn;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  cashBankAccount_Settings_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  cashBankAccount_Settings_CancelBtn;

	@FindBy(xpath="//input[@id='id_header_268435459']")
	private static WebElement  departmentTxt;

	@FindBy(xpath="//input[@id='id_header_268435470']")
	private static WebElement  PDRVATPlaceOfSupplyTXt;



	@FindBy(xpath="//*[@id='id_header_268435459_input_image']/span")
	private static WebElement  department_ExpansionBtn;

	@FindBy(xpath="//*[@id='id_header_268435459_input_settings']/span")
	private static WebElement  department_SettingsBtn;

	@FindBy(xpath="//div[@id='id_header_268435459_customize_popup_container']")
	private static WebElement  department_Settings_Container;

	@FindBy(xpath="//div[@id='id_header_268435459_customize_popup_footer']//input[1]")
	private static WebElement  department_Settings_StandardFieldsBtn;

	@FindBy(xpath="//select[@id='id_header_268435459_customize_popup_standardfields_list']")
	private static WebElement  department_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath="//input[@id='id_header_268435459_customize_popup_standardfields_header']")
	private static WebElement  department_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath="//select[@id='id_header_268435459_customize_popup_standardfields_alignment']")
	private static WebElement  department_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath="//input[@id='id_header_268435459_customize_popup_standardfields_width']")
	private static WebElement  department_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  department_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  department_Settings_StandardFieldsBtn_CancelBtn;


	@FindBy(xpath="//div[@id='id_header_268435459_search_container']//input[2]")
	private static WebElement  department_Settings_DeleteColumnBtn;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  department_Settings_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  department_Settings_CancelBtn;

	@FindBy(xpath="//*[@id='id_header_6']")
	private static WebElement  maturityDateTxt;

	@FindBy(xpath="//*[@id='id_header_6_input_image']/span']")
	private static WebElement  maturityDateTxt_CalenderBtn;

	@FindBy(xpath="//input[@id='id_header_3']")
	private static WebElement  purchaseAccountTxt;

	@FindBy(xpath="//*[@id='id_header_3_input_image']/span")
	private static WebElement  purchaseAccount_ExpansionBtn;

	@FindBy(xpath="//*[@id='id_header_3_input_settings']/span")
	private static WebElement  purchaseAccount_SettingsBtn;

	@FindBy(xpath="//div[@id='id_header_3_customize_popup_container']")
	private static WebElement  purchaseAccount_Settings_Container;

	@FindBy(xpath="//div[@id='id_header_3_customize_popup_footer']//input[1]")
	private static WebElement  purchaseAccount_Settings_StandardFieldsBtn;

	@FindBy(xpath="//select[@id='id_header_3_customize_popup_standardfields_list']")
	private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath="//input[@id='id_header_3_customize_popup_standardfields_header']")
	private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath="//select[@id='id_header_3_customize_popup_standardfields_alignment']")
	private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath="//input[@id='id_header_3_customize_popup_standardfields_width']")
	private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_CancelBtn;


	@FindBy(xpath="//div[@id='id_header_3_search_container']//input[2]")
	private static WebElement  purchaseAccount_Settings_DeleteColumnBtn;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  purchaseAccount_Settings_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  purchaseAccount_Settings_CancelBtn;


	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  vendorAccountTxt;

	@FindBy(xpath="//*[@id='id_header_4_input_image']/span")
	private static WebElement  vendorAccount_ExpansionBtn;

	@FindBy(xpath="//*[@id='id_header_4_input_settings']/span")
	private static WebElement  vendorAccount_SettingsBtn;

	@FindBy(xpath="//div[@id='id_header_4_customize_popup_container']")
	private static WebElement  vendorAccount_Settings_Container;

	@FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
	private static WebElement  vendorAccount_Settings_StandardFieldsBtn;

	@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_list']")
	private static WebElement  vendorAccount_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_header']")
	private static WebElement  vendorAccount_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_alignment']")
	private static WebElement  vendorAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_width']")
	private static WebElement  vendorAccount_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  vendorAccount_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  vendorAccount_Settings_StandardFieldsBtn_CancelBtn;


	@FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]")
	private static WebElement  vendorAccount_Settings_DeleteColumnBtn;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  vendorAccount_Settings_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  vendorAccount_Settings_CancelBtn;

	@FindBy(xpath="//input[@id='id_header_3']")
	private static WebElement  salesAccountTxt;

	@FindBy(xpath="//*[@id='id_header_3_input_image']/span")
	private static WebElement  salesAccount_ExpansionBtn;

	@FindBy(xpath="//*[@id='id_header_3_input_settings']/span")
	private static WebElement  salesAccount_SettingsBtn;

	@FindBy(xpath="//div[@id='id_header_3_customize_popup_container']")
	private static WebElement  salesAccount_Settings_Container;

	@FindBy(xpath="//div[@id='id_header_3_customize_popup_footer']//input[1]")
	private static WebElement  salesAccount_Settings_StandardFieldsBtn;

	@FindBy(xpath="//select[@id='id_header_3_customize_popup_standardfields_list']")
	private static WebElement  salesAccount_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath="//input[@id='id_header_3_customize_popup_standardfields_header']")
	private static WebElement  salesAccount_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath="//select[@id='id_header_3_customize_popup_standardfields_alignment']")
	private static WebElement  salesAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath="//input[@id='id_header_3_customize_popup_standardfields_width']")
	private static WebElement  salesAccount_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  salesAccount_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  salesAccount_Settings_StandardFieldsBtn_CancelBtn;


	@FindBy(xpath="//div[@id='id_header_3_search_container']//input[2]")
	private static WebElement  salesAccount_Settings_DeleteColumnBtn;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  salesAccount_Settings_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  salesAccount_Settings_CancelBtn;

	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  customerAccountTxt;

	@FindBy(xpath="//*[@id='id_header_4_input_image']/span")
	private static WebElement  customerAccount_ExpansionBtn;

	@FindBy(xpath="//*[@id='id_header_4_input_settings']/span")
	private static WebElement  customerAccount_SettingsBtn;

	@FindBy(xpath="//div[@id='id_header_4_customize_popup_container']")
	private static WebElement  customerAccount_Settings_Container;

	@FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
	private static WebElement  customerAccount_Settings_StandardFieldsBtn;

	@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_list']")
	private static WebElement  customerAccount_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_header']")
	private static WebElement  customerAccount_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_alignment']")
	private static WebElement  customerAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_width']")
	private static WebElement  customerAccount_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  customerAccount_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  customerAccount_Settings_StandardFieldsBtn_CancelBtn;


	@FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]")
	private static WebElement  customerAccount_Settings_DeleteColumnBtn;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  customerAccount_Settings_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  customerAccount_Settings_CancelBtn;

	@FindBy(xpath="//input[@id='id_header_12']")
	private static WebElement  accountTxt;

	@FindBy(xpath="//*[@id='id_header_12_input_image']/span")
	private static WebElement  account_ExpansionBtn;

	@FindBy(xpath="//*[@id='id_header_4_input_settings']/span")
	private static WebElement  account_SettingsBtn;

	@FindBy(xpath="//div[@id='id_header_4_customize_popup_container']")
	private static WebElement  account_Settings_Container;

	@FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
	private static WebElement  account_Settings_StandardFieldsBtn;

	@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_list']")
	private static WebElement  account_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_header']")
	private static WebElement  account_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_alignment']")
	private static WebElement  account_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_width']")
	private static WebElement  account_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  account_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  account_Settings_StandardFieldsBtn_CancelBtn;


	@FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]")
	private static WebElement  account_Settings_DeleteColumnBtn;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  account_Settings_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  account_Settings_CancelBtn;

	@FindBy(xpath="//input[@id='id_header_31']")
	private static WebElement  issuesReceiptsTxt;

	@FindBy(xpath="//input[@id='id_header_268435460']")
	private static WebElement  wareHouseTxt;

	@FindBy(xpath="//*[@id='id_header_268435460_input_image']/span")
	private static WebElement  wareHouse_ExpansionBtn;

	@FindBy(xpath="//*[@id='id_header_268435460_input_settings']/span")
	private static WebElement  wareHouse_SettingsBtn;

	@FindBy(xpath="//div[@id='id_header_268435460_customize_popup_container']")
	private static WebElement  wareHouse_Settings_Container;

	@FindBy(xpath="//div[@id='id_header_268435460_customize_popup_footer']//input[1]")
	private static WebElement  wareHouse_Settings_StandardFieldsBtn;

	@FindBy(xpath="//select[@id='id_header_268435460_customize_popup_standardfields_list']")
	private static WebElement  wareHouse_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath="//input[@id='id_header_268435460_customize_popup_standardfields_header']")
	private static WebElement  wareHouse_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath="//select[@id='id_header_268435460_customize_popup_standardfields_alignment']")
	private static WebElement  wareHouse_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath="//input[@id='id_header_268435460_customize_popup_standardfields_width']")
	private static WebElement  wareHouse_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  wareHouse_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  wareHouse_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath="//div[@id='id_header_268435460_search_container']//input[2]")
	private static WebElement  wareHouse_Settings_DeleteColumnBtn;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  wareHouse_Settings_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  wareHouse_Settings_CancelBtn;

	@FindBy(xpath="//span[contains(text(),'sName')]")
	private static WebElement  customize_sName;

	@FindBy(xpath="//span[@class='vcenter'][contains(text(),'Code')]")
	private static WebElement  customize_sCode;

	@FindBy(xpath="//span[contains(text(),'Alias')]")
	private static WebElement  customize_Alias;

	@FindBy(xpath="//span[@class='vcenter'][contains(text(),'Group')]")
	private static WebElement  customize_bGroup;

	@FindBy(xpath="//span[contains(@class,'vcenter')][contains(text(),'Balance')]")
	private static WebElement  customize_Balance;

	@FindBy(xpath="//input[@id='id_header_67108920']")
	private static WebElement  appropriateBasedOndropdown;

	@FindBy(xpath="//input[@id='id_header_67108921']")
	private static WebElement  additionalValueTxt;

	@FindBy(xpath="//input[@id='id_header_21']")
	private static WebElement  raiseReceiptsChkBox;

	@FindBy(xpath="//input[@id='id_header_67108865']")
	private static WebElement  receipts_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108868']")
	private static WebElement  payments_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108927']")
	private static WebElement  paymentsVAT_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108920']")
	private static WebElement  recepitsVAT_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108921']")
	private static WebElement  recepitsVAT_ChequeNoTxt;

	@FindBy(xpath="//input[@id='id_header_67108956']")
	private static WebElement  JVVAT_NarrationTxt;





	@FindBy(xpath="//input[@id='id_header_67108871']")
	private static WebElement  pettyCash_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108874']")
	private static WebElement  postDatedReceipts_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108932']")
	private static WebElement  PDRVAT_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108937']")
	private static WebElement  PDPVAT_NarrationTxt;


	@FindBy(xpath="//input[@id='id_header_268435471']")
	private static WebElement  PDPVAT_JuridictionTxt;

	@FindBy(xpath="//input[@id='id_header_268435471']")
	private static WebElement  PDRVAT_JuridictionTxt;




	@FindBy(xpath="//input[@id='id_header_67108865']")
	private static WebElement  postDatedPayments_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108880']")
	private static WebElement  purchaseVouchers_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108881']")
	private static WebElement  purchaseReturns_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108884']")
	private static WebElement  salesInvoice_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108886']")
	private static WebElement  salesOrder_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108928']")
	private static WebElement  salesInvoiceNewNarrationTxt;


	@FindBy(xpath="//input[@id='id_header_67108885']")
	private static WebElement  salesReturns_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108913']")
	private static WebElement  cashSales_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108914']")
	private static WebElement  hirePurchaseSales_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108890']")
	private static WebElement  journalEntries_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108916']")
	private static WebElement  forexJV_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108910']")
	private static WebElement  interDepartmentalJV_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108888']")
	private static WebElement  nonStandardJournalEntries_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108960']")
	private static WebElement  debitNotes_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108911']")
	private static WebElement  debitNotesLineWise_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108893']")
	private static WebElement  creditNotes_NarrationTxt;


	@FindBy(xpath="//input[@id='id_header_67108962']")
	private static WebElement creditNotesVatNarrationTxt;


	@FindBy(xpath="//input[@id='id_header_67108912']")
	private static WebElement  creditNotesLineWisePayroll_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108894']")
	private static WebElement  openingBalance_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108891']")
	private static WebElement  fixedAssetDepreciationVoucher_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108909']")
	private static WebElement  requestForQuote_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108903']")
	private static WebElement  purchasesQuotations_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108882']")
	private static WebElement  purchasesOrders_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108882']")
	private static WebElement  materialReceiptsNotes_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108904']")
	private static WebElement  salesQuotationss_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108887']")
	private static WebElement  deliveryNotes_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108917']")
	private static WebElement  posSales_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108918']")
	private static WebElement  productionOrder_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108886']")
	private static WebElement  salesOrders_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108895']")
	private static WebElement  shortagesinStock_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108896']")
	private static WebElement  excessesinStocks_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108897']")
	private static WebElement  stockTransfers_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108898']")
	private static WebElement  openingStocks_NarrationTxt;

	@FindBy(xpath="//*[@id='id_header_67108923']")
	private static WebElement  openingStocksNEW_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108908']")
	private static WebElement  materialRequisition_NarrationTxt;

	@FindBy(xpath="//input[@id='id_header_67108866']")
	private static WebElement  receipts_ChequeNoTxt;

	@FindBy(xpath="//input[@id='id_header_67108869']")
	private static WebElement  payments_ChequeNoTxt;


	@FindBy(xpath="//input[@id='id_header_67108930']")
	private static WebElement  paymentsVAT_ChequeNoTxt;





	@FindBy(xpath="//input[@id='id_header_67108872']")
	private static WebElement  pettyCash_ChequeNoTxt;

	@FindBy(xpath="//input[@id='id_header_67108875']")
	private static WebElement  postDatedReceipts_ChequeNoTxt;

	@FindBy(xpath="//input[@id='id_header_67108878']")
	private static WebElement  postDatedPayments_ChequeNoTxt;



	//Voucher Entry Page Body Fields

	@FindBy(xpath="//input[@id='id_body_536870916']")
	private static WebElement  pvWareHouseTxt;

	@FindBy(xpath="//td[@id='id_body_536870916_input_image']//span[@class='icon-down-arrow optioncontrol_arrow_margin']")
	private static WebElement  pvWareHouse_ExpansionBtn;

	@FindBy(xpath="//td[@id='id_body_536870916_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement  pvWareHouse_SettingsBtn;

	@FindBy(xpath="//div[@id='id_body_536870916_customize_popup_container']")
	private static WebElement  pvWareHouse_Settings_Container;

	@FindBy(xpath="//div[@id='id_body_536870916_customize_popup_footer']//input[1]")
	private static WebElement  pvWareHouse_Settings_StandardFieldsBtn;

	@FindBy(xpath="//select[@id='id_body_536870916_customize_popup_standardfields_list']")
	private static WebElement  pvWareHouse_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath="//input[@id='id_body_536870916_customize_popup_standardfields_header']")
	private static WebElement  pvWareHouse_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath="//select[@id='id_body_536870916_customize_popup_standardfields_alignment']")
	private static WebElement  pvWareHouse_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath="//input[@id='id_body_536870916_customize_popup_standardfields_width']")
	private static WebElement  pvWareHouse_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  pvWareHouse_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  pvWareHouse_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath="//div[@id='id_body_536870916_search_container']//input[2]")
	private static WebElement  pvWareHouse_Settings_DeleteColumnBtn;

	@FindBy(xpath="//div[@class='panel']//input[3]")
	private static WebElement  pvWareHouse_Settings_OkBtn;

	@FindBy(xpath="//div[@class='panel']//input[4]")
	private static WebElement  pvWareHouse_Settings_CancelBtn;

	// Grid Elements
	@FindBy(xpath="//th[@id='id_transaction_entry_detail_table_control_heading_1']")
	private static WebElement  grid_Header_Account;

	@FindBy(xpath="//th[@id='id_transaction_entry_detail_table_control_heading_1']")
	private static WebElement  grid_Header_Item;

	@FindBy(xpath="//th[@id='id_transaction_entry_detail_table_control_heading_1']")
	private static WebElement  grid_Header_DebitAC;

	@FindBy(xpath="//th[@id='id_transaction_entry_detail_table_control_heading_2']")
	private static WebElement  grid_Header_CreditAC;



	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[1]")
	private static WebElement  firstRowIndex;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[1]")
	private static WebElement  secondRowIndex;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[1]")
	private static WebElement  thirdRowIndex;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[1]")
	private static WebElement  fourthRowIndex;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[1]")
	private static WebElement  fifthRowIndex;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[1]")
	private static WebElement  sixthRowIndex;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[1]")
	private static WebElement  seventhRowIndex;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[1]")
	private static WebElement  eigthRowIndex;

	@FindBy(xpath="//span[@class='icon-delete icon-font8']")
	private static WebElement  deleteRowBtn;

	@FindBy(xpath="//span[@class='icon-insertrow icon-font8']")
	private static WebElement  insertRowBtn;

	@FindBy(xpath="//span[@class='icon-selectall icon-font8']")
	private static WebElement  selectRowBtn;

	@FindBy(xpath="//span[@class='icon-unselectall1 icon-font8']")
	private static WebElement  unSelectRowBtn;

	@FindBy(xpath="//span[@class='icon-clone icon-font8']")
	private static WebElement  duplicateRowBtn;



	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[2]")
	private static WebElement  select1stRow_1stColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[3]")
	private static WebElement  select1stRow_2ndColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[4]")
	private static WebElement  select1stRow_3rdColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[5]")
	private static WebElement  select1stRow_4thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[6]")
	private static WebElement  select1stRow_5thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[7]")
	private static WebElement  select1stRow_6thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[8]")
	private static WebElement  select1stRow_7thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[9]")
	private static WebElement  select1stRow_8thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[10]")
	private static WebElement  select1stRow_9thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[11]")
	private static WebElement  select1stRow_10thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[12]")
	private static WebElement  select1stRow_11thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[13]")
	private static WebElement  select1stRow_12thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[14]")
	private static WebElement  select1stRow_13thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[15]")
	private static WebElement  select1stRow_14thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[16]")
	private static WebElement  select1stRow_15thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[17]")
	private static WebElement  select1stRow_16thColumn;





	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[2]")
	private static WebElement  select2ndRow_1stColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[3]")
	private static WebElement  select2ndRow_2ndColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[4]")
	private static WebElement  select2ndRow_3rdColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[5]")
	private static WebElement  select2ndRow_4thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[6]")
	private static WebElement  select2ndRow_5thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[7]")
	private static WebElement  select2ndRow_6thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[8]")
	private static WebElement  select2ndRow_7thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[9]")
	private static WebElement  select2ndRow_8thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[10]")
	private static WebElement  select2ndRow_9thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[12]")
	private static WebElement  select2ndRow_11thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[13]")
	private static WebElement  select2ndRow_12thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[11]")
	private static WebElement  select2ndRow_10thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[15]")
	private static WebElement  select2ndRow_14thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[16]")
	private static WebElement  select2ndRow_15thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[17]")
	private static WebElement  select2ndRow_16thColumn;




	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[2]")
	private static WebElement  select3rdRow_1stColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[3]")
	private static WebElement  select3rdRow_2ndColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[4]")
	private static WebElement  select3rdRow_3rdColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[5]")
	private static WebElement  select3rdRow_4thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[6]")
	private static WebElement  select3rdRow_5thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[7]")
	private static WebElement  select3rdRow_6thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[8]")
	private static WebElement  select3rdRow_7thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[9]")
	private static WebElement  select3rdRow_8thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[10]")
	private static WebElement  select3rdRow_9thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[11]")
	private static WebElement  select3rdRow_10thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[12]")
	private static WebElement  select3rdRow_11thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[13]")
	private static WebElement  select3rdRow_12thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[14]")
	private static WebElement  select3rdRow_13thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[15]")
	private static WebElement  select3rdRow_14thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[16]")
	private static WebElement  select3rdRow_15thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[17]")
	private static WebElement  select3rdRow_16thColumn;




	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[2]")
	private static WebElement  select4thRow_1stColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[3]")
	private static WebElement  select4thRow_2ndColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[4]")
	private static WebElement  select4thRow_3rdColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[5]")
	private static WebElement  select4thRow_4thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[6]")
	private static WebElement  select4thRow_5thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[7]")
	private static WebElement  select4thRow_6thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[8]")
	private static WebElement  select4thRow_7thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[9]")
	private static WebElement  select4thRow_8thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[10]")
	private static WebElement  select4thRow_9thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[11]")
	private static WebElement  select4thRow_10thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[12]")
	private static WebElement  select4thRow_11thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[13]")
	private static WebElement  select4thRow_12thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[14]")
	private static WebElement  select4thRow_13thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[15]")
	private static WebElement  select4thRow_14thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[16]")
	private static WebElement  select4thRow_15thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[17]")
	private static WebElement  select4thRow_16thColumn;



	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[2]")
	private static WebElement  select5thRow_1stColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[3]")
	private static WebElement  select5thRow_2ndColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[4]")
	private static WebElement  select5thRow_3rdColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[5]")
	private static WebElement  select5thRow_4thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[6]")
	private static WebElement  select5thRow_5thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[7]")
	private static WebElement  select5thRow_6thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[8]")
	private static WebElement  select5thRow_7thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[9]")
	private static WebElement  select5thRow_8thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[10]")
	private static WebElement  select5thRow_9thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[11]")
	private static WebElement  select5thRow_10thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[12]")
	private static WebElement  select5thRow_11thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[13]")
	private static WebElement  select5thRow_12thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[14]")
	private static WebElement  select5thRow_13thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[15]")
	private static WebElement  select5thRow_14thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[16]")
	private static WebElement  select5thRow_15thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[17]")
	private static WebElement  select5thRow_16thColumn;




	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[2]")
	private static WebElement  select6thRow_1stColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[3]")
	private static WebElement  select6thRow_2ndColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[4]")
	private static WebElement  select6thRow_3rdColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[5]")
	private static WebElement  select6thRow_4thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[6]")
	private static WebElement  select6thRow_5thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[7]")
	private static WebElement  select6thRow_6thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[8]")
	private static WebElement  select6thRow_7thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[9]")
	private static WebElement  select6thRow_8thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[10]")
	private static WebElement  select6thRow_9thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[11]")
	private static WebElement  select6thRow_10thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[12]")
	private static WebElement  select6thRow_11thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[13]")
	private static WebElement  select6thRow_12thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[14]")
	private static WebElement  select6thRow_13thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[15]")
	private static WebElement  select6thRow_14thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[16]")
	private static WebElement  select6thRow_15thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[17]")
	private static WebElement  select6thRow_16thColumn;



	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[2]")
	private static WebElement  select7thRow_1stColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[3]")
	private static WebElement  select7thRow_2ndColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[4]")
	private static WebElement  select7thRow_3rdColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[5]")
	private static WebElement  select7thRow_4thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[6]")
	private static WebElement  select7thRow_5thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[7]")
	private static WebElement  select7thRow_6thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[8]")
	private static WebElement  select7thRow_7thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[9]")
	private static WebElement  select7thRow_8thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[10]")
	private static WebElement  select7thRow_9thColumn;




	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[2]")
	private static WebElement  select8thRow_1stColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[3]")
	private static WebElement  select8thRow_2ndColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[4]")
	private static WebElement  select8thRow_3rdColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[5]")
	private static WebElement  select8thRow_4thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[6]")
	private static WebElement  select8thRow_5thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[7]")
	private static WebElement  select8thRow_6thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[8]")
	private static WebElement  select8thRow_7thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[9]")
	private static WebElement  select8thRow_8thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[10]")
	private static WebElement  select8thRow_9thColumn;



	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[2]")
	private static WebElement  select9thRow_1stColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[3]")
	private static WebElement  select9thRow_2ndColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[4]")
	private static WebElement  select9thRow_3rdColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[5]")
	private static WebElement  select9thRow_4thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[6]")
	private static WebElement  select9thRow_5thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[7]")
	private static WebElement  select9thRow_6thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[8]")
	private static WebElement  select9thRow_7thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[9]")
	private static WebElement  select9thRow_8thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[10]")
	private static WebElement  select9thRow_9thColumn;




	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[2]")
	private static WebElement  select10thRow_1stColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[3]")
	private static WebElement  select10thRow_2ndColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[4]")
	private static WebElement  select10thRow_3rdColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[5]")
	private static WebElement  select10thRow_4thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[6]")
	private static WebElement  select10thRow_5thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[7]")
	private static WebElement  select10thRow_6thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[8]")
	private static WebElement  select10thRow_7thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[9]")
	private static WebElement  select10thRow_8thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[10]")
	private static WebElement  select10thRow_9thColumn;



	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[2]")
	private static WebElement  select11thRow_1stColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[3]")
	private static WebElement  select11thRow_2ndColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[4]")
	private static WebElement  select11thRow_3rdColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[5]")
	private static WebElement  select11thRow_4thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[6]")
	private static WebElement  select11thRow_5thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[7]")
	private static WebElement  select11thRow_6thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[8]")
	private static WebElement  select11thRow_7thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[9]")
	private static WebElement  select11thRow_8thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[10]")
	private static WebElement  select11thRow_9thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[2]")
	private static WebElement  select12thRow_1stColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[3]")
	private static WebElement  select12thRow_2ndColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[4]")
	private static WebElement  select12thRow_3rdColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[5]")
	private static WebElement  select12thRow_4thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[6]")
	private static WebElement  select12thRow_5thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[7]")
	private static WebElement  select12thRow_6thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[8]")
	private static WebElement  select12thRow_7thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[9]")
	private static WebElement  select12thRow_8thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[10]")
	private static WebElement  select12thRow_9thColumn;

	@FindBy(xpath="//input[@id='id_body_12']")
	private static WebElement  enter_AccountTxt;

	@FindBy(xpath="//input[@id='id_body_16777306']")
	private static WebElement  enterpayVATTaxCode;

	@FindBy(xpath="//*[@id='id_body_16777304']")
	private static WebElement  enterReceiptsVATTaxCode;

	@FindBy(xpath="//input[@id='id_body_16777320']")
	private static WebElement  enterJVVATTaxCode;

	@FindBy(xpath="//input[@id='id_body_16777340']")
	private static WebElement  enterDebitVATTaxCode;

	@FindBy(xpath="//input[@id='id_body_16777342']")
	private static WebElement  enterCreditVATTaxCode;





	@FindBy(xpath="//input[@id='id_body_16777309']")
	private static WebElement  enterTaxcode;

	@FindBy(xpath="//input[@id='id_body_16777311']")
	private static WebElement  enterPVPVATTaxcode;






	@FindBy(xpath="//*[@id='id_body_12_input_image']/span")
	private static WebElement  enter_Account_ExpansionBtn;

	@FindBy(xpath="//*[@id='id_body_12_input_settings']/span")
	private static WebElement  enter_Account_SettingsBtn;

	@FindBy(xpath="//div[@id='id_header_12_customize_popup_container']")
	private static WebElement  enter_Account_Settings_Container;

	@FindBy(xpath="//div[@id='id_header_12_customize_popup_footer']//input[1]")
	private static WebElement  enter_Account_Settings_StandardFieldsBtn;

	@FindBy(xpath="//select[@id='id_header_12_customize_popup_standardfields_list']")
	private static WebElement  enter_Account_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath="//input[@id='id_header_12_customize_popup_standardfields_header']")
	private static WebElement  enter_Account_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath="//select[@id='id_header_12_customize_popup_standardfields_alignment']")
	private static WebElement  enter_Account_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath="//input[@id='id_header_12_customize_popup_standardfields_width']")
	private static WebElement  enter_Account_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
	private static WebElement  enter_Account_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
	private static WebElement  enter_Account_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath="//div[@id='id_header_12_search_container']//input[2]")
	private static WebElement  enter_Account_Settings_DeleteColumnBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
	private static WebElement  enter_Account_Settings_OkBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
	private static WebElement  enter_Account_Settings_CancelBtn;

	@FindBy(xpath="//input[@id='id_body_16']")
	private static WebElement  enter_Amount;

	@FindBy(xpath="//textarea[@id='id_body_16777219']")
	private static WebElement  enter_Receipts_Remarks;

	@FindBy(xpath="//textarea[@id='id_body_16777222']")
	private static WebElement  enter_Payments_Remarks;

	@FindBy(xpath="//textarea[@id='id_body_16777225']")
	private static WebElement  enter_PettyCash_Remarks;

	@FindBy(xpath="//textarea[@id='id_body_16777228']")
	private static WebElement  enter_PostDatedReceipts_Remarks;

	@FindBy(xpath="//textarea[@id='id_body_16777231']")
	private static WebElement  enter_PostDatedPaymentss_Remarks;

	@FindBy(xpath="//input[@id='id_body_23']")
	private static WebElement  enter_ItemTxt;

	@FindBy(xpath="//*[@id='id_body_23_input_image']/span")
	private static WebElement  item_ExpansionBtn;

	@FindBy(xpath="//*[@id='id_body_23_input_settings']/span")
	private static WebElement  item_SettingsBtn;

	@FindBy(xpath="//div[@id='id_body_23_customize_popup_container']")
	private static WebElement  item_Settings_Container;

	@FindBy(xpath="//div[@id='id_body_23_customize_popup_footer']//input[1]")
	private static WebElement  item_Settings_StandardFieldsBtn;

	@FindBy(xpath="//select[@id='id_body_23_customize_popup_standardfields_list']")
	private static WebElement  item_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath="//input[@id='id_body_23_customize_popup_standardfields_header']")
	private static WebElement  item_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath="//select[@id='id_body_23_customize_popup_standardfields_alignment']")
	private static WebElement  item_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath="//input[@id='id_body_23_customize_popup_standardfields_width']")
	private static WebElement  item_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
	private static WebElement  item_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
	private static WebElement  item_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath="//div[@id='id_body_23_search_container']//input[2]")
	private static WebElement  item_Settings_DeleteColumnBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
	private static WebElement  item_Settings_OkBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
	private static WebElement  item_Settings_CancelBtn;

	@FindBy(xpath="//input[@id='id_body_24']")
	private static WebElement  enter_UnitTxt;

	@FindBy(xpath="//*[@id='id_body_24_input_image']/span")
	private static WebElement  unit_ExpansionBtn;

	@FindBy(xpath="//*[@id='id_body_24_input_settings']/span")
	private static WebElement  unit_SettingsBtn;

	@FindBy(xpath="//div[@id='id_body_24_customize_popup_container']")
	private static WebElement  unit_Settings_Container;

	@FindBy(xpath="//div[@id='id_body_24_customize_popup_footer']//input[1]")
	private static WebElement  unit_Settings_StandardFieldsBtn;

	@FindBy(xpath="//select[@id='id_body_24_customize_popup_standardfields_list']")
	private static WebElement  unit_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath="//input[@id='id_body_24_customize_popup_standardfields_header']")
	private static WebElement  unit_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath="//select[@id='id_body_24_customize_popup_standardfields_alignment']")
	private static WebElement  unit_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath="//input[@id='id_body_24_customize_popup_standardfields_width']")
	private static WebElement  unit_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
	private static WebElement  unit_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
	private static WebElement  unit_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath="//div[@id='id_body_24_search_container']//input[2]")
	private static WebElement  unit_Settings_DeleteColumnBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
	private static WebElement  unit_Settings_OkBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
	private static WebElement  unit_Settings_CancelBtn;


	@FindBy(xpath="//input[@id='id_body_26']")
	private static WebElement  enter_Quantity;

	@FindBy(xpath="//input[@id='id_body_27']")
	private static WebElement  enter_Rate;

	@FindBy(xpath="//*[@id='id_body_28']")
	private static WebElement  enter_Gross;

	@FindBy(xpath="//input[@id='id_body_13']")
	private static WebElement  enter_Batch;

	@FindBy(xpath="//input[@id='id_body_12']")
	private static WebElement  enter_DebitACTxt;

	@FindBy(xpath="//*[@id='id_body_12_input_image']/span")
	private static WebElement  enter_DebitAC_ExpansionBtn;

	@FindBy(xpath="//*[@id='id_body_12_input_settings']/span")
	private static WebElement  enter_DebitAC_SettingsBtn;

	@FindBy(xpath="//div[@id='id_header_12_customize_popup_container']")
	private static WebElement  enter_DebitAC_Settings_Container;

	@FindBy(xpath="//div[@id='id_header_12_customize_popup_footer']//input[1]")
	private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn;

	@FindBy(xpath="//select[@id='id_header_12_customize_popup_standardfields_list']")
	private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath="//input[@id='id_header_12_customize_popup_standardfields_header']")
	private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath="//select[@id='id_header_12_customize_popup_standardfields_alignment']")
	private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath="//input[@id='id_header_12_customize_popup_standardfields_width']")
	private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
	private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
	private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath="//div[@id='id_header_12_search_container']//input[2]")
	private static WebElement  enter_DebitAC_Settings_DeleteColumnBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
	private static WebElement  enter_DebitAC_Settings_OkBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
	private static WebElement  enter_DebitAC_Settings_CancelBtn;

	@FindBy(xpath="//input[@id='id_body_39']")
	private static WebElement  enter_CreditACTxt;

	@FindBy(xpath="//*[@id='id_body_39_input_image']/span")
	private static WebElement  enter_CreditAC_ExpansionBtn;

	@FindBy(xpath="//*[@id='id_body_39_input_settings']/span")
	private static WebElement  enter_CreditAC_SettingsBtn;

	@FindBy(xpath="//div[@id='id_header_39_customize_popup_container']")
	private static WebElement  enter_CreditAC_Settings_Container;

	@FindBy(xpath="//div[@id='id_header_39_customize_popup_footer']//input[1]")
	private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn;

	@FindBy(xpath="//select[@id='id_header_39_customize_popup_standardfields_list']")
	private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath="//input[@id='id_header_39_customize_popup_standardfields_header']")
	private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath="//select[@id='id_header_39_customize_popup_standardfields_alignment']")
	private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath="//input[@id='id_header_39_customize_popup_standardfields_width']")
	private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
	private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
	private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath="//div[@id='id_header_39_search_container']//input[2]")
	private static WebElement  enter_CreditAC_Settings_DeleteColumnBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
	private static WebElement  enter_CreditAC_Settings_OkBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
	private static WebElement  enter_CreditAC_Settings_CancelBtn;

	@FindBy(xpath="//input[@id='id_body_18']")
	private static WebElement  enter_DebitTxt;

	@FindBy(xpath="//input[@id='id_body_19']")
	private static WebElement  enter_CreditTxt;

	@FindBy(xpath="//textarea[@id='id_body_16777241']")
	private static WebElement  enter_NonStandardJournalEntries_RemarksTxt;

	@FindBy(xpath="//input[@id='id_body_87']")
	private static WebElement  enter_Warehouse2Txt;

	@FindBy(xpath="//*[@id='id_body_87_input_image']/span")
	private static WebElement  enter_Warehouse2_ExpansionBtn;

	@FindBy(xpath="//*[@id='id_body_87_input_settings']/span")
	private static WebElement  enter_Warehouse2_SettingsBtn;

	@FindBy(xpath="//div[@id='id_header_87_customize_popup_container']")
	private static WebElement  enter_WareHouse2_Settings_Container;

	@FindBy(xpath="//div[@id='id_header_87_customize_popup_footer']//input[1]")
	private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn;

	@FindBy(xpath="//select[@id='id_header_87_customize_popup_standardfields_list']")
	private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath="//input[@id='id_header_87_customize_popup_standardfields_header']")
	private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath="//select[@id='id_header_87_customize_popup_standardfields_alignment']")
	private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath="//input[@id='id_header_87_customize_popup_standardfields_width']")
	private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
	private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
	private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath="//div[@id='id_header_87_search_container']//input[2]")
	private static WebElement  enter_WareHouse2_Settings_DeleteColumnBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
	private static WebElement  enter_WareHouse2_Settings_OkBtn;

	@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
	private static WebElement  enter_WareHouse2_Settings_CancelBtn;


	// Right Panel InfoSide Bar	
	@FindBy(xpath="//*[@id='id_transactionentry_infopanel_container']/div[1]/div[2]/span")
	private static WebElement  infoSideBarCustomizeBtn;

	@FindBy(xpath="//*[@id='id_transactionentry_infopanel_container']/div[1]/div[3]/span")
	private static WebElement  infoSideBarMinimizeExpandBtn;

	@FindBy(xpath="//li[@id='Trans_Dash_Save']//span[text()='Save']")
	private static WebElement  customizeSaveBtn;

	@FindBy(xpath="//span[@class='noWrap clsBlueColor'][contains(text(),'Cancel')]")
	private static WebElement  customizeCancelBtn;

	@FindBy(xpath="//input[@id='searchBoxTrans']")
	private static WebElement  customizeSearchTxt;

	@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@class='icon-search searchicon']")
	private static WebElement  customizeSearchBtn;

	@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='g']")
	private static WebElement  graphBtn;

	@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='Newgraph']")
	private static WebElement  newGraphOption;

	@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='r']")
	private static WebElement  reportBtn;

	@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewReport']")
	private static WebElement  newReportOption;

	@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='i']")
	private static WebElement  infoPanelBtn;

	@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewInfopanel']")
	private static WebElement  newInfoPanelOption;



	@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='w']")
	private static WebElement  workFlowBtn;

	@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewWorkflow']")
	private static WebElement  newWorkFlowOption;

	@FindBy(xpath="//a[@id='DocumentInfoOption']")
	private static WebElement  otherDashlets;

	@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//label[contains(@class,'theme_icon-color')][contains(text(),'Document Info')]")
	private static WebElement  documentInfo;


	/*@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='w']")
		private static WebElement  workFlowBtn;

			@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//a[contains(text(),'New Workflow')]")
			private static WebElement  newWorkFlowOption;

		@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='d']")
		private static WebElement  otherDashlets;

			@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='id_Dashlet4']//a")
			private static WebElement  documentInfo;
	 */
	/*@FindBy(xpath="//span[contains(@class,'icon-left-and-right-panel-icon icon-font6 no_padding_left_right')]")
	private static WebElement  infoSideBarMinimizeExpandBtn;	*/	

	@FindBy(xpath="//span[@class='icon-left-and-right-panel-icon icon-font6 no_padding_left_right']")
	private static WebElement  infoSideBarExpandBtn;


	// Footer Section
	@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_net']")
	private static WebElement  netLabel;

	@FindBy(xpath="//*[@id='id_transactionentry_footer_panel_summary_value_net']/span[2]")
	private static WebElement  netAmount;

	@FindBy(xpath="//*[@id='id_transactionentry_summary_static']/div/div[1]")
	private static WebElement  footerAmtLabel;

	@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_16']")
	private static WebElement  footerAmount;




	//Navigation of Voucher Menus

	// Financial Menu and Sub Menus
	@FindBy(xpath="//span[@class='icon-financial icon-font1']")
	private static WebElement  finacinalsMenu;

	@FindBy(xpath="//a[@id='61']//span[contains(text(),'Transactions')]")
	private static WebElement  transactionsExpandBtn;

	@FindBy(xpath="//a[@id='2007']//span[contains(text(),'Purchases')]")
	private static WebElement  purchasesExpandBtn;

	@FindBy(xpath="//span[contains(text(),'Purchases Vouchers')]")
	private static WebElement  purchaseVouchersBtn;

	//Inventory Menu and Sub Menus		
	@FindBy(xpath="//div[contains(text(),'Inventory')]")
	private static WebElement  inventoryMenu; 

	@FindBy(xpath="//a[@id='137']//span[contains(text(),'Transactions')]")
	private static WebElement  inventoryTransactionsMenu; 

	@FindBy(xpath="//*[@id='139']/span")
	private static WebElement  inventoryTransactionsPurchasesMenu; 

	@FindBy(xpath="//*[@id='2010']/span")
	private static WebElement  requestForQuoteVoucher;

	@FindBy(xpath="//*[@id='2011']/span")
	private static WebElement  purchasesQuotationsVoucher;

	@FindBy(xpath="//*[@id='2012']/span")
	private static WebElement  purchasesOrdersVoucher;

	@FindBy(xpath="//*[@id='2013']/span")
	private static WebElement  materialReceiptNotesVoucher;

	@FindBy(xpath="//*[@id='140']/span")
	private static WebElement  inventoyTransactionsSalesMenu; 

	@FindBy(xpath="//*[@id='2018']/span")
	private static WebElement  salesQuotationsVoucher;

	@FindBy(xpath="//*[@id='2019']/span")
	private static WebElement  deliveryNotesVoucher;

	@FindBy(xpath="//*[@id='2022']/span")
	private static WebElement  posSalesVoucher;

	@FindBy(xpath="//*[@id='2045']/span")
	private static WebElement  productionOrdersVoucher;

	@FindBy(xpath="//*[@id='2017']/span")
	private static WebElement  salesOrdersVoucher;

	@FindBy(xpath="//a[@id='2033']//span[contains(text(),'Stocks')]")
	private static WebElement  inventoryTransactionsStocksMenu; 

	@FindBy(xpath="//*[@id='2034']/span")
	private static WebElement  shortagesInStockVoucher;

	@FindBy(xpath="//*[@id='2035']/span")
	private static WebElement  excessesInStocksVoucher;

	@FindBy(xpath="//*[@id='2036']/span")
	private static WebElement  stockTransfersVoucher;

	@FindBy(xpath="//a[@id='2037']//span[contains(text(),'Opening Stocks')]")
	private static WebElement  openingStocksVoucher;

	@FindBy(xpath="//a[@id='2049']//span[contains(text(),'Opening Stocks New')]")
	private static WebElement  openingStocksNewVoucher;

	@FindBy(xpath="//*[@id='2038']/span")
	private static WebElement  materialRequisitionVoucher;

	@FindBy(xpath="//*[@id='2049']/span")
	private static WebElement  stockAdjustmentVoucher;

	@FindBy(xpath="//*[@id='164']/span")
	private static WebElement  holdAndUnholdStockVoucher;

	@FindBy(xpath="//*[@id='93']/span")
	private static WebElement  stockReconciliation;

	@FindBy(xpath="//*[@id='99']/span")
	private static WebElement  stockAllocation;


	//Validation and Confirmation messages
	/*@FindBy(xpath="//div[@class='theme_color font-6']")
	public static WebElement errorMessage;

	@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
	public static WebElement errorMessageCloseBtn;*/
	
	@FindBy(xpath = "//*[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[2]")/////*[@id="idGlobalError"]//tr/td[2]/div[2]
	public static WebElement errorMessage;
	
	@FindBy(xpath = "//*[@id='idGlobalError']//tr/td[3]/span")///////*[@id="idGlobalError"]//tr/td[3]/span
	public static WebElement errorMessageCloseBtn;
	

	//Dash board Page
	@FindBy(xpath="//*[@id='dashName']")
	private static WebElement labelDashboard ;

	@FindBy(xpath="//*[@id='Select_dash']")
	private static WebElement selectDashboard ;

	@FindBy(xpath="//*[@id='Dashboard_AddDash']")
	private static WebElement newAddDashBoard;

	@FindBy(xpath="//*[@id='Dashboard_Dash_Config']")
	private static WebElement dashboardCustomizationSettings;



	//Vouchers Settings Options
	@FindBy(xpath="//span[@id='updateButton']")
	private static WebElement  updateBtn;

	@FindBy(xpath="//i[@class='icon-close icon-font6']")
	private static WebElement  settings_closeBtn;

	//Documents Tab
	@FindBy(xpath="//div[@class='font-5 theme_background-color-inverse theme_color-inverse']")
	private static WebElement  documentsTab;

	@FindBy(xpath="//li[@id='navigationtab1']")
	private static WebElement  documentsTabForMaterialReceiptNotes;

	@FindBy(xpath="//span[@id='DocumentLoadMasterPopupBtn']")
	private static WebElement  loadMastersBtn;

	@FindBy(xpath="//select[@id='doc_voucherDropDown']")
	private static WebElement  loadmasterDropDown;

	@FindBy(xpath="//button[@id='btnSelectDependMaster']")
	private static WebElement  selectAllBtn;

	@FindBy(xpath="//button[contains(text(),'Reset')]")
	private static WebElement  resetBtn;

	@FindBy(xpath="//button[@class='Fbutton pull-right'][contains(text(),'Ok')]")
	private static WebElement  okBtn;

	@FindBy(xpath="//*[@id='editScreen_CustomizeButtons']/span[1]")
	private static WebElement  deleteTagBtn;

	@FindBy(xpath="//span[@id='DocumentAddGroupPopupBtn']")
	private static WebElement  addGroupBtn;

	@FindBy(xpath="//input[@id='doc_GroupName']")
	private static WebElement  groupNameTXt;

	@FindBy(xpath="//button[contains(text(),'Add')]")
	private static WebElement  addBtn;

	@FindBy(xpath="//div[@class='col-xs-12 form-group']//button[@id='btnCancel']")
	private static WebElement  cancelBtn;

	@FindBy(xpath="//div[@id='voucherTabContent']//span[2]")
	private static WebElement  deletegroupBtn;

	@FindBy(xpath="//input[@id='doc_title']")
	private static WebElement  titleTxt;

	@FindBy(xpath="//input[@id='doc_baseDocument']")
	private static WebElement  baseDocumentTxt;

	@FindBy(xpath="//input[@id='txtbox_doc_Accountdepandency']")
	private static WebElement  accountDependencyTxt;

	@FindBy(xpath="//span[contains(text(),'iExchangeAdjustmentGainAC')]")
	private static WebElement  iExchangeAdjustmentGainACChkBox;

	@FindBy(xpath="//span[contains(text(),'iExchangeAdjustmentLossAC')]")
	private static WebElement  iExchangeAdjustmentLossACChkBox;

	@FindBy(xpath="//span[contains(text(),'iPrimaryAccount')]")
	private static WebElement  iPrimaryAccountChkBox;

	@FindBy(xpath="//span[contains(text(),'iCity')]")
	private static WebElement  iCityChkBox;

	@FindBy(xpath="//span[contains(text(),'iDeliveryCity')]")
	private static WebElement  iDeliverycityChkBox;

	@FindBy(xpath="//span[contains(text(),'iBankAc')]")
	private static WebElement  iBankACChkBox;

	@FindBy(xpath="//span[contains(text(),'iPDCDiscountedAC')]")
	private static WebElement  iPDCDiscountedACChkBox;

	@FindBy(xpath="//input[@id='txtbox_doc_Productdepandency']")
	private static WebElement  itemDependencyTxt;

	@FindBy(xpath="//span[contains(text(),'Outlet__')]")
	private static WebElement  outletChkBox;

	@FindBy(xpath="//span[contains(text(),'iCostofShortageStockAC')]")
	private static WebElement  iCostofShortageStockACChkBox;

	@FindBy(xpath="//span[contains(text(),'iCostofExcessStockAC')]")
	private static WebElement  iCostofExcessStockACChkBox;

	@FindBy(xpath="//span[contains(text(),'iCostofSaleReturnAC')]")
	private static WebElement  iCostofSaleReturnACChkBox;

	@FindBy(xpath="//span[contains(text(),'iPurchaseVarianceAC')]")
	private static WebElement  iPurchaseVarianceACChkBox;

	@FindBy(xpath="//span[contains(text(),'iDefaultBaseUnit')]")
	private static WebElement  iDefaultBaseUnitChkBox;

	@FindBy(xpath="//span[contains(text(),'iDefaultSalesUnit')]")
	private static WebElement  iDefaultSalesUnitChkBox;

	@FindBy(xpath="//span[contains(text(),'iDefaultPurchaseUnit')]")
	private static WebElement  iDefaultPurchaseUnitChkBox;

	@FindBy(xpath="//span[contains(text(),'iCostOfIssueAccount')]")
	private static WebElement  iCostOfIssueAccountChkBox;

	@FindBy(xpath="//span[contains(text(),'iStocksAccount')]")
	private static WebElement  iStocksAccountChkBox;

	@FindBy(xpath="//span[contains(text(),'iSalesAccount')]")
	private static WebElement  iSalesAccountChkBox;

	@FindBy(xpath="//li[12]//div[1]//label[1]//span[1]")
	private static WebElement  otherdetails1Box;

	@FindBy(xpath="//li[13]//div[1]//label[1]//span[1]")
	private static WebElement  replenishment1ChkBox;

	@FindBy(xpath="//span[contains(text(),'Reorder__')]")
	private static WebElement  reorderChkBox;

	@FindBy(xpath="//span[contains(text(),'iCategory')]")
	private static WebElement  iCategoryChkBox;

	@FindBy(xpath="//span[contains(text(),'iWIPAccount')]")
	private static WebElement  iWIPAccountChkBox;

	@FindBy(xpath="//span[contains(text(),'Classification__')]")
	private static WebElement  classificationChkBox;

	@FindBy(xpath="//li[18]//div[1]//label[1]//span[1]")
	private static WebElement  repelenishment2ChkBox;

	@FindBy(xpath="//li[19]//div[1]//label[1]//span[1]")
	private static WebElement  otherDetails2ChkBox;

	@FindBy(xpath="//span[contains(text(),'iBin')]")
	private static WebElement  iBinChkBox;

	@FindBy(xpath="//span[contains(text(),'iAlternateCategory')]")
	private static WebElement  iAlternateCategoryChkBox;

	@FindBy(xpath="//span[contains(text(),'iTaxCode')]")
	private static WebElement  iTaxCodeChkBox;

	@FindBy(xpath="//select[@id='doc_Accountdepandency_Filter']")
	private static WebElement  accountfilterDropdown;

	@FindBy(xpath="//select[@id='doc_Itemdepandency_Filter']")
	private static WebElement  itemfilterDropdown;


	// Documents Tab Grid Elements

	// first row 

	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-0']")
	private static WebElement  firstrow;

	@FindBy(xpath="//div[contains(text(),'Delete Row')]")
	private static WebElement  doc_deleterowBtn;

	@FindBy(xpath="//div[contains(text(),'Insert Row')]")
	private static WebElement  doc_insertRowBtn;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-1']")
	private static WebElement  masters1;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-2']")
	private static WebElement  position1;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-3']")
	private static WebElement  showDependency1;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-4']")
	private static WebElement  group1;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-5']")
	private static WebElement  filter1;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_1-6']")
	private static WebElement  mandatory1;


	// Second Row // Delete and Insert row are same

	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-0']")
	private static WebElement  secondRow;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-1']")
	private static WebElement  masters2;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-2']")
	private static WebElement  position2;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-3']")
	private static WebElement  showDependency2;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-4']")
	private static WebElement  group2;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-5']")
	private static WebElement  filter2;

	@FindBy(xpath="//td[@id='doc_TagsTable_col_2-6']")
	private static WebElement  mandatory2;

	// After clicking // Properties Changes which are same for all rows

	@FindBy(xpath="//select[@id='doc_TagsTableMasterDropDown']")
	private static WebElement  masterDropDown;

	@FindBy(xpath="//select[@id='doc_TagsPositionDropDown']")
	private static WebElement  positionDropdown;

	@FindBy(xpath="//input[@id='txtbox_doc_TagsDepedencyDropDown']")
	private static WebElement  showDependencyDropdown;

	@FindBy(xpath="//input[@id='doc_TagsGroupTxtbox']")
	private static WebElement  groupTxt;

	@FindBy(xpath="//select[@id='docFilter']")
	private static WebElement  filterDropdown;

	@FindBy(xpath="//select[@id='doc_MandatoryDropDown']")
	private static WebElement  mandatoryDropDown;




	//Views Tab
	@FindBy(xpath="//span[@class='icon-views'")
	private static WebElement  viewsTab;

	//Export Fields 
	@FindBy(xpath="//span[contains(text(),'Export Fields')]")
	private static WebElement exportFieldsTab;

	//Triggers
	@FindBy(xpath="//span[@class='icon-trigger icon-font7']")
	private static WebElement  triggersTab;	

	//Document Numbering
	@FindBy(xpath="//span[contains(text(),'Document Numbering')]")
	private static WebElement  documentNumberingTab;

	//Hire Purchase	
	@FindBy(xpath="//span[contains(text(),'Hire Purchase')]")
	private static WebElement hirePurchasetab;

	//Reports Tab	
	@FindBy(xpath="//span[@class='icon-text70 icon-font7']")
	private static WebElement  reportsTab;	

	//Schemes
	@FindBy(xpath="//span[contains(text(),'Schemes')]")
	private static WebElement schemestab;	


	// Bin Inward Elements

	@FindBy (xpath="//input[@id='id_bins_totalquantity']")
	private static WebElement binTotalQty;

	@FindBy (xpath="//div[@class='modal-body']//div[4]")
	private static WebElement binBaseUOM;

	@FindBy (xpath="//input[@id='srch_bin']")
	private static WebElement binSearchTxt;

	@FindBy (xpath="//i[@class='icon-search']")
	private static WebElement binSearchBtn; 

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-0']")
	private static WebElement  binselect1stRow_1stColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-1']")
	private static WebElement  binselect1stRow_2ndColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-3']")
	private static WebElement  binselect1stRow_3rdColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-5']")
	private static WebElement  binselect1stRow_4thColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-6']")
	private static WebElement  binselect1stRow_5thColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-7']")
	private static WebElement  binselect1stRow_6thColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-8']")
	private static WebElement  binselect1stRow_7thColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-12']")
	private static WebElement  binselect1stRow_8thColumn;


	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-0']")
	private static WebElement  binselect2ndRow_1stColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-1']")
	private static WebElement  binselect2ndRow_2ndColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-3']")
	private static WebElement  binselect2ndRow_3rdColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-5']")
	private static WebElement  binselect2ndRow_4thColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-6']")
	private static WebElement  binselect2ndRow_5thColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-7']")
	private static WebElement  binselect2ndRow_6thColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-8']")
	private static WebElement  binselect2ndRow_7thColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-12']")
	private static WebElement  binselect2ndRow_8thColumn;


	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-0']")
	private static WebElement  binselect3rdRow_1stColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-1']")
	private static WebElement  binselect3rdRow_2ndColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-3']")
	private static WebElement  binselect3rdRow_3rdColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-5']")
	private static WebElement  binselect3rdRow_4thColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-6']")
	private static WebElement  binselect3rdRow_5thColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-7']")
	private static WebElement  binselect3rdRow_6thColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-8']")
	private static WebElement  binselect3rdRow_7thColumn;

	@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-12']")
	private static WebElement  binselect3rdRow_8thColumn;


	@FindBy(xpath="//span[@class='icon-sum']")
	private static WebElement  binRowSum;

	@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[2]")
	private static WebElement  binRowSum_2ndColumn;

	@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[4]")
	private static WebElement  binSelect4htRow_3rdColumn;

	@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[6]")
	private static WebElement  binRowSum_4thColumn;

	@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[7]")
	private static WebElement  binRowSum_5thColumn;

	@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[8]")
	private static WebElement  binRowSum_6thColumn;

	@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[9]")
	private static WebElement  binRowSum_7thColumn;

	@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[12]")
	private static WebElement  binRowSum_8thColumn;


	@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[13]")
	private static WebElement  binSumInward;



	@FindBy (xpath="//input[@id='id_bins_balance']")
	private static WebElement binBalanceTxt;

	@FindBy (xpath="//div[@id='id_btnalternatecategorycheck']//div[@class='toolbar_button_image']")
	private static WebElement binAlternateCategoryCheckBtn;

	@FindBy (xpath="//div[@id='id_btnautoallocate']//div[@class='toolbar_button_image']")
	private static WebElement binAutoAllocateBtn;

	@FindBy (xpath="//span[@class='icon-pick icon-font4']")
	private static WebElement binPickBtn; 

	@FindBy (xpath="//div[@id='id_btnautoallocategroup']//div[@class='toolbar_button_image']")
	private static WebElement binAutoAllocateWithinGroupBtn;

	@FindBy (xpath="//div[@id='id_bins_ok']//span[@class='icon-ok icon-font6']")
	private static WebElement binOkBtn;

	@FindBy (xpath="//div[@class='col-xs-9 pull-right']//span[@class='icon-close icon-font6']")
	private static WebElement binCancelBtn;


	// RMA POpup Window
	@FindBy (xpath="//div[@id='Modal_Header']/div[1]")
	private static WebElement rmaScreenTitle;

	@FindBy (xpath="//input[@id='txtSerialNo']")
	private static WebElement rmaSerialNumberTxtField;

	@FindBy (xpath="//input[@id='txtQuantity']")
	private static WebElement rmaQuantityTxtField;

	@FindBy (xpath="//div[@id='img_add']/span")
	private static WebElement rmaAddBtn;

	@FindBy (xpath="//div[@id='Modal_Search_Body']/div[3]/label")
	private static WebElement rmaNumberofItemsLabel;

	@FindBy (xpath="//th[@id='RMA_Table_control_heading_1']/div")
	private static WebElement rmaTableHeadingRMA;

	@FindBy (xpath="//th[@id='RMA_Table_control_heading_2']/div")
	private static WebElement rmaTableHeadingDocumentNo;

	@FindBy (xpath="//th[@id='RMA_Table_control_heading_3']/div")
	private static WebElement rmaTableHeadingDocumentDate;

	@FindBy (xpath="//div[@id='RMAModel_Bottom']/div[1]/label")
	private static WebElement rmaClearBtn;

	@FindBy (xpath="//div[@id='RMAModel_Bottom']/div[2]/label")
	private static WebElement rmaOkBtn;

	@FindBy (xpath="//div[@id='RMAModel_Bottom']/div[3]/label")
	private static WebElement rmaCancelBtn;

	@FindBy (xpath="//div[@id='Modal_Header']/div[2]/span/i")
	private static WebElement rmaCloseBtn;

	@FindBy (xpath="//td[@id='RMA_Table_col_1-1']")
	private static WebElement rmaTableRow1Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_2-1']")
	private static WebElement rmaTableRow2Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_3-1']")
	private static WebElement rmaTableRow3Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_4-1']")
	private static WebElement rmaTableRow4Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_5-1']")
	private static WebElement rmaTableRow5Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_6-1']")
	private static WebElement rmaTableRow6Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_7-1']")
	private static WebElement rmaTableRow7Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_8-1']")
	private static WebElement rmaTableRow8Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_9-1']")
	private static WebElement rmaTableRow9Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_10-1']")
	private static WebElement rmaTableRow10Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_11-1']")
	private static WebElement rmaTableRow11Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_12-1']")
	private static WebElement rmaTableRow12Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_13-1']")
	private static WebElement rmaTableRow13Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_14-1']")
	private static WebElement rmaTableRow14Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_15-1']")
	private static WebElement rmaTableRow15Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_16-1']")
	private static WebElement rmaTableRow16Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_17-1']")
	private static WebElement rmaTableRow17Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_18-1']")
	private static WebElement rmaTableRow18Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_19-1']")
	private static WebElement rmaTableRow19Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_20-1']")
	private static WebElement rmaTableRow20Column1;

	@FindBy (xpath="//td[@id='RMA_Table_col_1-2']")
	private static WebElement rmaTableRow1Column2;

	@FindBy (xpath="//td[@id='RMA_Table_col_1-3']")
	private static WebElement rmaTableRow1Column3;

	@FindBy (xpath="//td[@id='id_body_38_input_image']/img")
	private static WebElement rmaExpansionBtn;


	//----------------------------------------------------------------------------------------------------------    
	// Edit Screen Tab     

	@FindBy(xpath="//span[contains(text(),'Edit Screen')]")
	private static WebElement  editScreenTab; 

	@FindBy(xpath="//i[@class='icon-add icon-font7']")
	private static WebElement editScreenaddBtn;

	@FindBy(xpath="//a[contains(text(),'Field Details')]")
	private static WebElement editScreenFieldDetailsTab;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_Caption']")
	private static WebElement  editScreenCaptionTxt;

	@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_DataType']")
	private static WebElement  editScreenCaptionDataTypeDropdown;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_DefaultValue']")
	private static WebElement editScreenDefaultValueTxt;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_noofDecimals']")
	private static WebElement editScreenNoOfDecimalsDropdown;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_toolTip']")
	private static WebElement editScreenToolTipTxt;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_bannerText']")
	private static WebElement editScreenBannerTextTxt;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_MinValue']")
	private static WebElement editScreenMinimunValueTxt;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_MaxValue']")
	private static WebElement editScreenMaximunValueTxt;

	@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_behaviour']")
	private static WebElement editScreenAddFieldsBehaviourDropdown;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_Formula_textbox']")
	private static WebElement  editScreenAddBehaviourformulaTxt;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_Formula_Ok']")
	private static WebElement  editScreenAddBehaviourFormulaokBtn;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_PreLoad_textbox']")
	private static WebElement editScreenPreloadTxt;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_PreLoad_textbox']")
	private static WebElement editScreenRestrictformulaTxt;

	@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_RoundOff']")
	private static WebElement editScreenRoundOffsDropdown;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_RoundOffTo']")
	private static WebElement editScreenRoundOffToTxt;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_RestrictMsg']")
	private static WebElement editScreenRestrictMessageTxt;

	@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_AddToNet']")
	private static WebElement editScreenAddToNetDropdown;

	@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_AddToStock']")
	private static WebElement editScreenAddToStockDropDown;

	@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_Position']")
	private static WebElement editScreenpositionDropdown;  

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_Columnwidth']")
	private static WebElement editScreenColumnWidthTxt;  

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkValinBaseCurency']")
	private static WebElement editScreenValueInBaseCurrencyChkBox;  

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkValinBaseCurency']")
	private static WebElement editScreenHideFromSummaryChkBox;  

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkPostToAcc']")
	private static WebElement editScreenPostToAccountChkBox;  

	@FindBy(xpath="//input[@id='acc1-1']")
	private static WebElement editScreenAccount1Radio;  

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc1']")
	private static WebElement editScreenAccount1Txt;  

	@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_defaultAcc1_input_image']/span")
	private static WebElement editScreenAccount1ExpandBtn;  

	@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_defaultAcc1_input_settings']/span")
	private static WebElement editScreenAccount1SettingsBtn;  

	@FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_container']")
	private static WebElement editScreenAccount1Container;  

	@FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_footer']//input[1]")
	private static WebElement editScreenAccount1StandardFiledsBtn;  

	@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_standardfields_list']")
	private static WebElement editScreenAccount1StandardFiledsDropdown;  

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_standardfields_header']")
	private static WebElement editScreenAccount1StandardFiledsHeaderTxt;  

	@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_standardfields_alignment']")
	private static WebElement editScreenAccount1StandardFiledsAllignmentDropdown; 

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_standardfields_width']")
	private static WebElement editScreenAccount1StandardFiledsWidthTxt;  

	@FindBy(xpath="//section[@id='page_Content']//input[3]")
	private static WebElement editScreenAccount1StandardFiledsokBtn;  

	@FindBy(xpath="//section[@id='page_Content']//input[4]")
	private static WebElement editScreenAccount1StandardFiledscancelBtn;  

	@FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc1_search_container']//input[2]")
	private static WebElement editScreenAccount1deleteColumnBtn;

	@FindBy(xpath="//section[@id='page_Content']//input[3]")
	private static WebElement editScreenAccount1okBtn;  

	@FindBy(xpath="//section[@id='page_Content']//input[4]")
	private static WebElement editScreenAccount1cancelBtn;

	@FindBy(xpath="//input[@id='acc2-2']")
	private static WebElement editScreenAccount2Radio;  

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc2']")
	private static WebElement editScreenAccount2Txt;  

	@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_defaultAcc2_input_image']/span")
	private static WebElement editScreenAccount2ExpandBtn;

	@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_defaultAcc2_input_settings']/span")
	private static WebElement editScreenAccount2SettingsBtn;  

	@FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_container']")
	private static WebElement editScreenAccount2Container;  

	@FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_footer']//input[1]")
	private static WebElement editScreenAccount2StandardFiledsBtn;  

	@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_standardfields_list']")
	private static WebElement editScreenAccount2StandardFiledsDropdown;  

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_standardfields_header']")
	private static WebElement editScreenAccount2StandardFiledsHeaderTxt;  

	@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_standardfields_alignment']")
	private static WebElement editScreenAccount2StandardFiledsAllignmentDropdown; 

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_standardfields_width']")
	private static WebElement editScreenAccount2StandardFiledsWidthTxt;  

	@FindBy(xpath="//section[@id='page_Content']//input[3]")
	private static WebElement editScreenAccount2StandardFiledsokBtn;  

	@FindBy(xpath="//section[@id='page_Content']//input[4]")
	private static WebElement editScreenAccount2StandardFiledscancelBtn;  

	@FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc2_search_container']//input[2]")
	private static WebElement editScreenAccount2deleteColumnBtn;

	@FindBy(xpath="//section[@id='page_Content']//input[3]")
	private static WebElement editScreenAccount2okBtn;  

	@FindBy(xpath="//section[@id='page_Content']//input[4]")
	private static WebElement editScreenAccount2cancelBtn;

	@FindBy(xpath="//input[@id='acc1-3']")
	private static WebElement editScreenAccount1VariableRadio; 

	@FindBy(xpath="//input[@id='Account_1Var']")
	private static WebElement editScreenAccount1VariableTxt;

	@FindBy(xpath="//input[@id='acc2-4']")
	private static WebElement editScreenAccount2VariableRadio; 

	@FindBy(xpath="//input[@id='Account_2Var']")
	private static WebElement editScreenAccount2VariableTxt;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_RegularExpr']")
	private static WebElement editScreenRegularExpTxt; 

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_ErrorMsg']")
	private static WebElement editScreenerrorMessageTxt; 

	// properties  

	@FindBy(xpath="//a[contains(text(),'Properties')]")
	private static WebElement editScreenPropertiesTab;  

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkAuditTrail']")
	private static WebElement editScreenauditTrailChkBox;  

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkCantExprt']")
	private static WebElement editScreencantExportChkBox;  

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkCantImprt']")
	private static WebElement editScreencantImportChkbox; 

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkHidden']")
	private static WebElement editScreenhiddenChkbox;  

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkMandatory']")
	private static WebElement editScreenmandatorychkBox; 

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkNotAvailForReports']")
	private static WebElement editScreennotAvailableForReportsChkBox;  

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkReadOnly']")
	private static WebElement editScreenreadOnlyChkBox;  


	@FindBy(xpath="//span[contains(text(),'Apply')]")
	private static WebElement editScreenApplyBtn;  

	@FindBy(xpath="//span[@id='editScreen_FieldsCustomization_Close']")
	private static WebElement editScreencloseBtn;  



	@FindBy(xpath="//a[@href='#editScreen_FieldsCustomization_ExternalModules']")
	private static WebElement editScreenExternalModulesTab; 

	// External Module Tab is named As EFES And ELV For Each Screen (ReceiptsEFES,ReceiptsELV )
	// External Functions(External Fields) Changes From Screen to Screen

	// Formatting Tab

	@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_tabs']/li[3]/a")
	private static WebElement editScreenformattingTab;

	@FindBy(xpath="//*[@id='fontFamily_editScreen_FieldsCustomization_FontCtrl']")
	private static WebElement editScreenFontFamilyDropdown;

	@FindBy(xpath="//*[@id='fontStyle_editScreen_FieldsCustomization_FontCtrl']")
	private static WebElement editScreenFontStyleDropdown;

	@FindBy(xpath="//*[@id='fontWeight_editScreen_FieldsCustomization_FontCtrl']")
	private static WebElement editScreenFontWeightDropdown;

	@FindBy(xpath="//*[@id='fontSizes_editScreen_FieldsCustomization_FontCtrl']")
	private static WebElement editScreenFontSizeDropdown;

	@FindBy(xpath="//*[@id='fontForeColor_editScreen_FieldsCustomization_FontCtrl']")
	private static WebElement editScreenForeColourDropdown;

	@FindBy(xpath="//*[@id='fontBackColor_editScreen_FieldsCustomization_FontCtrl']")
	private static WebElement editScreenBackColourDropdown;

	@FindBy(xpath="//*[@id='chkBaseline_editScreen_FieldsCustomization_FontCtrl']")
	private static WebElement editScreenBaseLineCheckbox;

	@FindBy(xpath="//*[@id='chkOverLine_editScreen_FieldsCustomization_FontCtrl']")
	private static WebElement editScreenOverLineCheckbox;

	@FindBy(xpath="//*[@id='chkStrikeThrough_editScreen_FieldsCustomization_FontCtrl']")
	private static WebElement EditScreenStrikeThroughCheckbox;

	@FindBy(xpath="//*[@id='chkUnderline_editScreen_FieldsCustomization_FontCtrl']")
	private static WebElement editScreenUnderlineCheckbox;

	@FindBy(xpath="//*[@id='previewfont_editScreen_FieldsCustomization_FontCtrl']")
	private static WebElement editScreenFontPreviewTxt;

	@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_Formatting_chkenableFont']")
	private static WebElement editScreenenableFontChkbox;

	@FindBy(xpath="//i[@class='icon-copyfields icon-font7']")
	private static WebElement editScreenLoadFieldsBtn;  

	@FindBy(xpath="//select[@id='editScreen_voucherDropDown']")
	private static WebElement editScreenLoadFieldsDropdown;  

	@FindBy(xpath="//*[@id='editScreen_copyFieldsDiv']/div[3]/button[1]")
	private static WebElement editScreenselectAllBtn;  

	@FindBy(xpath="//div[@id='editScreen_copyFieldsDiv']//button[@class='Fbutton pull-right'][contains(text(),'Ok')]")
	private static WebElement editScreenokBtn;  

	@FindBy(xpath="//input[@id='searchlayout2']")
	private static WebElement editScreenSearchTxt;  

	@FindBy(xpath="//button[@id='btnEditScreenPrev']")
	private static WebElement editScreenPreviousBtn;  

	@FindBy(xpath="//button[@id='btnEditScreenNext']")
	private static WebElement editScreenNextBtn;  

	@FindBy(xpath="//*[@id='editScreen_tabContent']/label")
	private static WebElement editScreenRatePreloadLabel;

	@FindBy(xpath="//select[@id='cmbBehaviour']")
	private static WebElement editScreenBehaviourDropdown;

	@FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_textbox']")
	private static WebElement editScreenQuantityPreloadedTxt;

	@FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_formulaText']")
	private static WebElement  formulaTxt;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_expandedFormula']")
	private static WebElement  expandeFormula;

	// Grid Elements 
	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_1-2']//span[@class='icon-collepse icon-font8']")
	private static WebElement  editScreenTransactionExpandBtn;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_2-2']")
	private static WebElement  editScreenQuantity;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_2-3']")
	private static WebElement  editScreenqty;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_3-2']")
	private static WebElement  editScreenRate;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_3-3']")
	private static WebElement  editScreenrt;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_4-2']")
	private static WebElement  editScreenAlternateQty;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_4-3']")
	private static WebElement  editScreenqtya;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_5-2']")
	private static WebElement  editScreengrossAmount;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_5-3']")
	private static WebElement  editScreengr;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_6-2']")
	private static WebElement  editScreenStockValue;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_6-3']")
	private static WebElement  editScreenstkv;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_7-2']")
	private static WebElement  editScreenAccount;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_7-3']")
	private static WebElement  EditScreenacc;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_8-2']")
	private static WebElement  editScreenAccount2;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_8-3']")
	private static WebElement  editScreenacc2;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_9-2']")
	private static WebElement  editScreenExchangeRate;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_9-3']")
	private static WebElement  editScreenexrt;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_10-2']")
	private static WebElement  editScreenqtyinBaseUnit;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_10-3']")
	private static WebElement  editScreenqtyb;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_11-2']")
	private static WebElement  editScreenCurrency;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_11-3']")
	private static WebElement  editScreencrn;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_12-2']")
	private static WebElement  editScreenValueOfThetagMasterIDofTheTag;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_12-3']")
	private static WebElement  editScreentgval;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_13-2']")
	private static WebElement  editScreenNetAmount;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_13-3']")
	private static WebElement  EditScreennet;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_14-2']")
	private static WebElement  editScreenNetAmountInOriginalCurrency;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_14-3']")
	private static WebElement  editScreenneto;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_15-2']")
	private static WebElement  editScreenTotalQuantity;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_15-3']")
	private static WebElement  editScreentqty;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_16-2']")
	private static WebElement  editScreenTotalGross;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_16-3']")
	private static WebElement  editScreentgr;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_17-2']//span[@class='icon-expand icon-font8']")
	private static WebElement  screenFiledExpandBtn;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_18-2']")
	private static WebElement  mrnQtyInput;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_18-3']")
	private static WebElement  sb1;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_19-2']")
	private static WebElement  mrnQtyCalculatedValue;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_19-3']")
	private static WebElement  sbo1;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_20-2']")
	private static WebElement  qtyBalancedInput;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_20-3']")
	private static WebElement  sb2;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_21-2']")
	private static WebElement  qtyCalculatedValue;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_21-3']")
	private static WebElement  sbO2;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_22-2']")
	private static WebElement  averagerateInput;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_22-3']")
	private static WebElement  sb3;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_23-2']")
	private static WebElement  avreageRateCalculatedValue;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_23-3']")
	private static WebElement  sbO3;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_24-2']")
	private static WebElement  addValueInput;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_24-3']")
	private static WebElement  sb4;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_25-2']")
	private static WebElement  addValueInputCalculatedValue;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_25-3']")
	private static WebElement  sbO4;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_26-2']//span[@class='icon-collepse icon-font8']")
	private static WebElement  layoutFieldExpandBtn;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_27-2']")
	private static WebElement  appropriateBasedOnInput;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_27-3']")
	private static WebElement  lh0;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_28-2']")
	private static WebElement  additionalValueInput;

	@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_28-3']")
	private static WebElement  lh1;

	//Grid Completed

	@FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_availableVariables']")
	private static WebElement  editScreenqtyFormulaSearchTxt;

	@FindBy(xpath="//button[@id='editScreen_qtyPreLoaded_PlusOpt']")
	private static WebElement  editScreenqtyPlusBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'-')]")
	private static WebElement  editScreenqtyMinusBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded']//button[3]")
	private static WebElement  editScreenqtyDivideBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'*')]")
	private static WebElement  editScreenqtyMultiplyBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded']//button[5]")
	private static WebElement  editScreenqtyBrackets1Btn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded']//button[6]")
	private static WebElement  editScreenqtyBrackets2Btn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'~')]")
	private static WebElement  editScreenqtyTildeBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'&')]")
	private static WebElement  editScreenqtyAndBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'%')]")
	private static WebElement  editScreenqtyPercentBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//div[@id='operationButtons']//button[@class='btn btn-link'][contains(text(),']')]")
	private static WebElement  editScreenqtySquarebracketBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'|')]")
	private static WebElement  editScreenqtyVerticalBarBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'\')]")
	private static WebElement  editScreenqtyBackSlashBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'<')]")
	private static WebElement  editScreenqtyLessThanbtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'>')]")
	private static WebElement  editScreenqtyGreaterThanBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'=')]")
	private static WebElement  editScreenqtyExclamationBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'=')]")
	private static WebElement  editScreenqtyEqualBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'?:')]")
	private static WebElement  editScreenqtyQuestionBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'^')]")
	private static WebElement  editScreenqtyCaretBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'DateDiff()')]")
	private static WebElement  editScreenqtyDateDiffBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'Cond()')]")
	private static WebElement  editScreenqtyCondBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'Min()')]")
	private static WebElement  editScreenqtyMinBtn;

	@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'Max()')]")
	private static WebElement  editScreenqtyMaxBtn;

	@FindBy(xpath="//button[@id='editScreen_qtyPreLoaded_Ok']")
	private static WebElement  editScreenqtyConditionokBtn;

	@FindBy(xpath="//button[@id='editScreen_qtyPreLoaded_Cancel']")
	private static WebElement  editScreenqtyConditioncancelBtn;


	@FindBy(xpath="//*[@id='editScreen_qtyFormula_textbox']")
	private static WebElement  editScreenformulaTxt;


	// CustomizeGrid

	@FindBy(xpath="//i[@class='icon-custamize icon-font7']")
	private static WebElement editScreencustomizeGridBtn;  

	@FindBy(xpath="//span[contains(text(),'Apportion')")
	private static WebElement editScreenApportionBtn;

	@FindBy(xpath="//span[contains(text(),'Audit Trial')]")
	private static WebElement editScreenAuditTrialBtn;  

	@FindBy(xpath="//span[contains(text(),'Back color')]")
	private static WebElement editScreenbackColorBtn;  

	@FindBy(xpath="//span[contains(text(),'Banner text')]")
	private static WebElement editScreenbannerTextBtn;  

	@FindBy(xpath="//span[contains(text(),'Cannot be exported')]")
	private static WebElement editScreencannotBeExportedBtn;  

	@FindBy(xpath="//span[contains(text(),'Cannot be imported')]")
	private static WebElement editScreencannotBeImportedBtn;  

	@FindBy(xpath="//span[contains(text(),'Column Span')]")
	private static WebElement editScreencolumnSpanBtn;  

	@FindBy(xpath="//span[contains(text(),'Copy from Parent')]")
	private static WebElement editScreencopyFromParentBtn;  

	@FindBy(xpath="//span[contains(text(),'DataType')]")
	private static WebElement editScreendataTypeBtn;  

	@FindBy(xpath="//span[contains(text(),'Default Value')]")
	private static WebElement editScreenDefaultValueBtn;  

	@FindBy(xpath="//span[contains(text(),'Error message')]")
	private static WebElement editScreenerrorMessageBtn;  

	@FindBy(xpath="//span[contains(text(),'External module attached')]")
	private static WebElement editScreenExternalModuleAttachedBtn;  

	@FindBy(xpath="//span[contains(text(),'Field Order')]")
	private static WebElement editScreenFilterOrderBtn;  

	@FindBy(xpath="//span[contains(text(),'Font')]")
	private static WebElement editScreenFontBtn;  

	@FindBy(xpath="//span[contains(text(),'Group Name')]")
	private static WebElement editScreengroupNameBtn;  

	@FindBy(xpath="//span[contains(text(),'Hide left panel')]")
	private static WebElement editScreenHideLeftPanelBtn;  

	@FindBy(xpath="//span[contains(text(),'Information Field')]")
	private static WebElement editScreenInformationFieldBtn;  

	@FindBy(xpath="//span[contains(text(),'Mandatory')]")
	private static WebElement editScreenMandatoryBtn;  

	@FindBy(xpath="//span[contains(text(),'Mass Update')]")
	private static WebElement editScreenMassupdateBtn;  

	@FindBy(xpath="//span[contains(text(),'Maximum Value')]")
	private static WebElement editScreenMaximumValueBtn;  

	@FindBy(xpath="//span[contains(text(),'Merge Field')]")
	private static WebElement editScreenMergerFieldBtn;  

	@FindBy(xpath="//span[contains(text(),'Minimum Value')]")
	private static WebElement editScreenMinimumValueBtn;  

	@FindBy(xpath="//span[contains(text(),'No Of Decimals')]")
	private static WebElement editScreenNoOfDecimalsBtn;  

	@FindBy(xpath="//span[contains(text(),'Not available for reports')]")
	private static WebElement editScreenNotAvailableForReportsBtn; 

	@FindBy(xpath="//span[contains(text(),'Read Only')]")
	private static WebElement editScreenReadOnlyBtn;  

	@FindBy(xpath="//span[contains(text(),'Regular expression')]")
	private static WebElement editScreenRegularExpressionBtn;  

	@FindBy(xpath="//span[contains(text(),'Restrict formula')]")
	private static WebElement editScreenRestrictFormulaBtn;  

	@FindBy(xpath="//span[contains(text(),'Restrict Message')]")
	private static WebElement editScreenRestrictMessageBtn;  

	@FindBy(xpath="//span[contains(text(),'Round Offs')]")
	private static WebElement editScreenRoundsOffsBtn;  

	@FindBy(xpath="//span[contains(text(),'Row Span')]")
	private static WebElement editScreenRowSpanBtn; 

	@FindBy(xpath="//span[contains(text(),'Rule Attached')]")
	private static WebElement editScreenRuleAttachedBtn;  

	@FindBy(xpath="//span[contains(text(),'Tooltip')]")
	private static WebElement editScreenToolTipBtn;  

	@FindBy(xpath="//span[contains(text(),'Variable name')]")
	private static WebElement editScreenVariableNameBtn;  





	// Body Tab 

	@FindBy(xpath="//a[contains(text(),'Body')]")
	private static WebElement  editScreenBodyTab; 

	@FindBy(xpath="//td[@id='editScreen_bodyrow_1 _1']//span[@id='editIcon']")
	private static WebElement  editScreenBody1stRowEditBtn; 

	@FindBy(xpath="//td[@id='editScreen_bodyrow_1 _1']//span[@id='deleteIcon']")
	private static WebElement  editScreenBody1stRowDeleteBtn; 

	@FindBy(xpath="//td[@id='editScreen_bodyrow_2 _1']//span[@id='editIcon']")
	private static WebElement  editScreenBody2ndRowEditBtn; 

	@FindBy(xpath="//td[@id='editScreen_bodyrow_2 _1']//span[@id='deleteIcon']")
	private static WebElement  editScreenBody2ndRowDeleteBtn; 

	@FindBy(xpath="//td[@id='editScreen_bodyrow_3 _1']//span[@id='editIcon']")
	private static WebElement  editScreenBody3rdRowEditBtn; 

	@FindBy(xpath="//td[@id='editScreen_bodyrow_3 _1']//span[@id='deleteIcon']")
	private static WebElement  editScreenBody3rdRowDeleteBtn; 

	@FindBy(xpath="//td[@id='editScreen_bodyrow_4 _1']//span[@id='editIcon']")
	private static WebElement  editScreenBody4thRowEditBtn; 

	@FindBy(xpath="//td[@id='editScreen_bodyrow_4 _1']//span[@id='deleteIcon']")
	private static WebElement  editScreenBody4thRowDeleteBtn; 

	@FindBy(xpath="//td[@id='editScreen_bodyrow_5 _1']//span[@id='editIcon']")
	private static WebElement  editScreenBody5thRowEditBtn; 

	@FindBy(xpath="//td[@id='editScreen_bodyrow_5 _1']//span[@id='deleteIcon']")
	private static WebElement  editScreenBody5thRowDeleteBtn;

	@FindBy(xpath="//td[@id='editScreen_bodyrow_6 _1']//span[@id='editIcon']")
	private static WebElement  editScreenBody6thRowEditBtn; 

	@FindBy(xpath="//td[@id='editScreen_bodyrow_6 _1']//span[@id='deleteIcon']")
	private static WebElement  editScreenBody6thRowDeleteBtn;

	@FindBy(xpath="//div[@id='editScreen_body']//button[@class='icon-up-arrow Fbutton']")
	private static WebElement  editScreenBodyUpArrowBtn; 

	@FindBy(xpath="//div[@id='editScreen_body']//button[@class='icon-down-arrow Fbutton']")
	private static WebElement  editScreenBodyDownArrowBtn;

	// Footer Tab

	@FindBy(xpath="//a[contains(text(),'Footer')]")
	private static WebElement  editScreenFooterTab;  

	@FindBy(xpath="//td[@id='editScreen_footerrow_1 _1']//span[@id='editIcon']")
	private static WebElement  editScreenFooter1stRowEditBtn; 

	@FindBy(xpath="//td[@id='editScreen_footerrow_1 _1']//span[@id='deleteIcon']")
	private static WebElement  editScreenFooter1stRowDeleteBtn; 

	@FindBy(xpath="//td[@id='editScreen_footerrow_2 _1']//span[@id='editIcon']")
	private static WebElement  editScreenFooter2ndRowEditBtn; 

	@FindBy(xpath="//td[@id='editScreen_footerrow_2 _1']//span[@id='deleteIcon']")
	private static WebElement  editScreenFooter2ndRowDeleteBtn; 

	@FindBy(xpath="//div[@id='editScreen_footer']//button[@class='icon-up-arrow Fbutton']")
	private static WebElement  editScreenFooterUpArrowBtn; 

	@FindBy(xpath="//div[@id='editScreen_footer']//button[@class='icon-down-arrow Fbutton']")
	private static WebElement  editScreenFooterDownArrowBtn; 

	@FindBy(xpath="//label[contains(text(),'Quantity preloaded')]")
	private static WebElement qtyPreloadedLabel;

	@FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_textbox']")
	private static WebElement qtyPreloadedTxt;

	@FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_formulaText']")
	private static WebElement qtyPreloadedformulaTxt;

	@FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_availableVariables']")
	private static WebElement qtyPreloadedFormulaSearchTxt;

	@FindBy(xpath="//button[@id='editScreen_qtyPreLoaded_Ok']")
	private static WebElement qtyPreloadedFormulaokBtn;

	@FindBy(xpath="//button[@id='editScreen_qtyPreLoaded_Cancel']")
	private static WebElement qtyPreloadedFormulacancelBtn;


	@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[1]/label/span")
	private static WebElement editScreenLoadFields1stChkBox;

	@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[2]/label/span")
	private static WebElement editScreenLoadFields2ndChkBox;

	@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[3]/label/span")
	private static WebElement editScreenLoadFields3rdChkBox;

	@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[4]/label/span")
	private static WebElement editScreenLoadFields4thChkBox;

	@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[5]/label/span")
	private static WebElement editScreenLoadFields5hChkBox;

	@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[6]/label/span")
	private static WebElement editScreenLoadFields6thChkBox;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_PreLoad_formulaText']")
	private static WebElement  preloadformulaTxt;

	@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_PreLoad_availableVariables']")
	private static WebElement  preloadFormulaSearchTxt;

	@FindBy(xpath="//button[@id='editScreen_FieldsCustomization_PreLoad_Ok']")
	private static WebElement  preloadFormulaokBtn;

	@FindBy(xpath="//button[@id='editScreen_FieldsCustomization_PreLoad_Cancel']")
	private static WebElement  preloadFormulacancelBtn;


	@FindBy(xpath="//td[@id='editScreen_footerrow_1 _3']")
	private static WebElement  editScreenFooter1stRowCaption;

	@FindBy(xpath="//td[@id='editScreen_footerrow_1 _3']")
	private static WebElement  editScreenFooter2ndRowCaption;

	@FindBy(xpath="//td[@id='editScreen_bodyrow_1 _3']")
	private static WebElement  editScreenbody1stRowCaption;

	@FindBy(xpath="//td[@id='editScreen_bodyrow_2 _3']")
	private static WebElement  editScreenbody2ndRowCaption;

	@FindBy(xpath="//td[@id='editScreen_bodyrow_3 _3']")
	private static WebElement  editScreenbody3rdRowCaption;

	@FindBy(xpath="//td[@id='editScreen_bodyrow_4 _3']")
	private static WebElement  editScreenbody4thRowCaption;

	@FindBy(xpath="//td[@id='editScreen_bodyrow_5 _3']")
	private static WebElement  editScreenbody5thRowCaption;



	// Add To Stock Status

	@FindBy(xpath="//td[@id='editScreen_bodyrow_1 _14']")
	private static WebElement  editScreenbody1stRowAddtoStock;

	@FindBy(xpath="//td[@id='editScreen_bodyrow_2 _14']")
	private static WebElement  editScreenbody2ndRowAddtoStock;

	@FindBy(xpath="//td[@id='editScreen_bodyrow_3 _14']")
	private static WebElement  editScreenbody3rdRowAddtoStock;

	@FindBy(xpath="//td[@id='editScreen_bodyrow_4 _14']")
	private static WebElement  editScreenbody4thRowAddtoStock;

	@FindBy(xpath="//td[@id='editScreen_bodyrow_5 _14']")
	private static WebElement  editScreenbody5thRowAddtoStock;			

	// Suspend Status Of Entry Page
	@FindBy(xpath="//tr[1]//td[11]")
	private static WebElement suspendStatusRow1;

	//User Name Display
	@FindBy(xpath="/html/body/section/div[2]/header/nav/div/ul/li[6]/a/span")
	private static WebElement userNameDisplay;

	@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
	private static WebElement companyName;

	@FindBy(xpath="//*[@id='companyLogo']")
	private static WebElement companyLogo;

	@FindBy(xpath="//div[@id='Layout_Popup']//input[2]")
	private static WebElement noIn;

	@FindBy(xpath="//input[@id='donotshow']")
	private static WebElement doNotShowCheckbox;

	@FindBy(xpath="//span[@class='pull-right']")
	private static WebElement closeBtnInDemoPopupScreen;


	// Inentory Menu 

	@FindBy(xpath="//a[@id='137']//span[contains(text(),'Transactions')]")
	private static WebElement  invTransactionsMenu; 

	@FindBy(xpath="//a[@id='139']//span[contains(text(),'Purchases')]")
	private static WebElement  invTransPurchasesMenu; 

	@FindBy(xpath="//a[@id='140']//span[contains(text(),'Sales')]")
	private static WebElement  invTransSalesMenu; 

	@FindBy(xpath="//a[@id='2033']//span[contains(text(),'Stocks')]")
	private static WebElement  invTransStocksMenu; 

	@FindBy(xpath="//a[@id='200']//span[contains(text(),'Reports')]")
	private static WebElement  inventoryReportsMenu; 

	@FindBy(xpath="//span[contains(text(),'Order Management')]")
	private static WebElement  orderManagementMenu; 

	// Home Menu
	@FindBy(xpath = "//*[@id='1']/div/span")
	public static WebElement homeMenu;

	//Financial Menu
	@FindBy (xpath="//span[@class='icon-financial icon-font1']")
	private static WebElement financialMenu;

	//Fixed Assets Menu
	@FindBy (xpath="//span[@class='icon-assets icon-font1']")
	private static WebElement fixedAssetsMenu;

	//Production Menu
	@FindBy (xpath="//span[@class='icon-production icon-font1']")
	private static WebElement productionMenu;

	//Point Of Sale Menu
	@FindBy (xpath="//div[contains(text(),'Point of Sale')]")
	private static WebElement pointOfSaleMenu;

	//Quality Of Control Menu
	@FindBy (xpath="//span[@class='icon-quotationanalysis icon-font1']")
	private static WebElement qualityControlMenu;

	//Settings Menu
	@FindBy (xpath="//span[@class='icon-settings icon-font1']")
	private static WebElement SettingsMenu;


	// Login Page
	@FindBy(xpath = "//*[@id='txtUsername']")
	private static WebElement username;



	/*private static String xlSheetName = "SmokeVouchers";*/

	private static boolean Status;

	private String expOsVoucherGrossR4;



	public boolean checkLoadingMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
			String actVoucherLoadingMessage=errorMessage.getText();
			String expVoucherLoadingMessage="Voucher loaded successfully";

			System.out.println("VoucherLoadingMessage  : " + actVoucherLoadingMessage + " Value Expected : " + expVoucherLoadingMessage);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
			errorMessageCloseBtn.click();

			if(actVoucherLoadingMessage.startsWith(expVoucherLoadingMessage))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			System.err.println("UNABLE TO COMPARE");
			return false;
		}
	}




	public boolean checkVoucherSavingMessage(String docno) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
			String actErrorMessage=errorMessage.getText();
			String expErrorMessage="Voucher saved successfully";
			String expErrorMessage1=": "+docno;

			System.out.println("SavingMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage+" "+expErrorMessage1);

			if(actErrorMessage.startsWith(expErrorMessage) && actErrorMessage.endsWith(expErrorMessage1))
			{
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
					errorMessageCloseBtn.click();

					return  true;
				}
				catch(Exception ee)
				{
					return true;
				}	
			}
			else
			{
				return false;
			}	
		}
		catch(Exception e)
		{
			System.err.println("UNABLE TO COMPARE");
			return false;
		}
	}



	public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
			String actErrorMessage=errorMessage.getText();
			String expErrorMessage=ExpMessage;

			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
				errorMessageCloseBtn.click();

				System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);

				return actErrorMessage;
			}
			catch(Exception ee)
			{

				System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);

				return actErrorMessage;
			}
		}
		catch(Exception e)
		{
			System.err.println("Error Message NOT Found or NOT Clickable");
			System.err.println(e.getMessage());

			String Exception=e.getMessage();

			return Exception;	
		} 
	}	


	public static void checkUserFriendlyMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
			String actErrorMessage=errorMessage.getText();

			System.out.println("Open Page then Message Display  :  " + actErrorMessage);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
			errorMessageCloseBtn.click();
		}
		catch(Exception e)
		{
			System.err.println("Error Message NOT Found or NOT Clickable");
			System.err.println(e.getMessage());

			String Exception=e.getMessage();
		}
	}




	public boolean checkEntryPageDeleteMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
		String actErrorMessage=errorMessage.getText();
		String expErrorMessage="Voucher deleted Successfully";

		System.out.println("DeletingMessage  :  " + actErrorMessage + " Value Expected : " + expErrorMessage);

		if(actErrorMessage.equalsIgnoreCase(expErrorMessage))
		{
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
				errorMessageCloseBtn.click();

				return  true;
			}
			catch(Exception ee)
			{
				return true;
			}
		}
		else
		{
			return false;
		}
	}





	public static void checkPopUpWindow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		////Thread.sleep(5000);

		try 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotShowCheckbox));
			doNotShowCheckbox.click();

			////Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInDemoPopupScreen));
			closeBtnInDemoPopupScreen.click(); 

			System.err.println("POP UP DISPLAYED AND CLOSED SUCCESSFULLY");	 
		} 
		catch (Exception e)
		{
			System.err.println("NO POP UP DISPLAYED");
		}	

		//Thread.sleep(4000);
	}



	@FindBy(xpath="//button[contains(text(),'Ok')]")
	private static WebElement loginRefreshOkBtn;

	public static void checkRefreshPopOnlogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		try 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loginRefreshOkBtn));
			loginRefreshOkBtn.click();
		} 
		catch (Exception e)
		{
			System.err.println("Exception : "+e.getMessage());
			System.err.println("NO ALERT POP UP DISPLAYED");
		}

		//Thread.sleep(4000);
	}


	@FindBy(xpath = "//ul[@id='navigation_menu']/li/a/div/div")
	private static List<WebElement> menusList;

	@FindBy(xpath = "//ul[@id='navigation_menu']/li[3]/ul/li/a/span")
	private static List<WebElement> inventoryMenusList;

	@FindBy(xpath = "//ul[@id='navigation_menu']/li[3]/ul/li[1]/ul/li/a/span")
	private static List<WebElement> inventoryTransactionsMenusList;

	@FindBy(xpath = "//ul[@id='navigation_menu']/li[3]/ul/li[1]/ul/li[3]/ul/li/a/span")
	private static List<WebElement> inventoryTransactionsStocksMenusList;

	@FindBy(xpath = "//*[@id='dv_TranHomeHeading']/nav/div[2]/div/div/div[2]")
	private static List<WebElement> openingStocksNewToolBarButtons;

	@FindBy(xpath = "//ul[@id='navigation_menu']/li[2]/ul/li/a/span")
	private static List<WebElement> financialsMenusList;

	@FindBy(xpath="//*[@id='62']/span")
	private static WebElement  financialsCreditManagementMenu; 

	@FindBy(xpath="//*[@id='81']/span")
	private static WebElement  financialsReportsMenu; 

	@FindBy(xpath="//*[@id='60']/div")
	private static WebElement  financialsMenu; 

	@FindBy(xpath="//*[@id='530']/span")
	private static WebElement  financialsFinalAccountsMenu; 

	@FindBy(xpath="//*[@id='558']/span")
	private static WebElement  financialsReceivableAndPayableAnalysisMenu;

	@FindBy(xpath="//*[@id='3301']/span")
	private static WebElement  financialsBudgetMenu;

	@FindBy(xpath="//*[@id='3311']/span")
	private static WebElement  financialsOnlinePaymentsMenu;


	@FindBy(xpath="//*[@id='dashName']")
	private static WebElement dashboard;


	@FindBy(id="ddlCompany")
	private static WebElement companyDropDownList;





	public boolean checkLoginToFinancialVouchers() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		
		LoginPage lp=new LoginPage(getDriver()); 

		String unamelt="su";

		String pawslt="su";

		lp.enterUserName(unamelt);

		//Thread.sleep(2000);

		lp.enterPassword(pawslt);


		//Thread.sleep(2000);

		lp.clickOnSignInBtn();

		//checkRefershPopOnlogin();

		//checkPopUpWindow();

		//Thread.sleep(5000);
		if(userNameDisplay.isDisplayed()==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@FindBy(xpath="//*[@id='2023']/span")
	private static WebElement  finTransJournalsMenu;

	@FindBy(xpath="//a[@id='5']")
	private static WebElement  PDCBtn;

	@FindBy(xpath = "//input[@id='gphDisplayInLedger']")
	public static WebElement displayLedgerAndBalanceChkbox;


	@FindBy(xpath = "//input[@id='chkPostDatedCheques']")
	public static WebElement postDatedChequeChkbox;


	public boolean checkPDCOptionsUnderSettings() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataManagementMenu));
			dataManagementMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reindexMenu));
			reindexMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fullReindexChkBox));
			fullReindexChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reindexOkBtn));
			reindexOkBtn.click();

			if(getIsAlertPresent())
			{
				getWaitForAlert();

				getAlert().accept();
			}

			Thread.sleep(200000);

			if(getIsAlertPresent())
			{
				getWaitForAlert();

				getAlert().accept();
			}

			Thread.sleep(5000);

			getDriver().navigate().refresh();

			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
			userNameDisplay.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();

			LoginPage lp=new LoginPage(getDriver()); 

			String unamelt="su";

		    String pawslt="su";

		    lp.enterUserName(unamelt);


		    lp.enterPassword(pawslt);


		    lp.clickOnSignInBtn();

		    Thread.sleep(5000);

		    getDriver().navigate().refresh();

		    Thread.sleep(2000);*/

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureTransactions));
		settingsConfigureTransactions.click();

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDCBtn));
		PDCBtn.click();

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(postDatedChequeChkbox));
		if (postDatedChequeChkbox.isSelected()==false)
		{
			postDatedChequeChkbox.click();
		}

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayLedgerAndBalanceChkbox));
		if (displayLedgerAndBalanceChkbox.isSelected()==true)
		{
			displayLedgerAndBalanceChkbox.click();
		}

		Thread.sleep(2000);

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
		updateBtn.click();

		getWaitForAlert();

		getAlert().accept();

		String expValidationMessage="Data saved successfully";

		String actValidationMessage=checkValidationMessage(expValidationMessage);

		if (actValidationMessage.equalsIgnoreCase(expValidationMessage)) 
		{
			return true;
		}
		else 
		{

			return false;
		}
	}







	// PDC////////////////////////////////////////////////////////

	@FindBy(xpath="//span[contains(text(),'Edit Layout')]")
	private static WebElement editLayoutTab;	

	@FindBy(xpath="//i[@class='icon-add icon-font7']")
	private static WebElement editLayoutAddFieldsBtn;

	@FindBy(xpath="//input[@id='EditLayout_FieldsCustomization_FieldDetails_Caption']")
	private static WebElement  editLayoutCaptionTxt;

	@FindBy(xpath="//span[contains(text(),'Apply')]")
	private static WebElement editLayoutApplyBtn;  


	/*@FindBy(xpath="//input[@id='id_header_67108973']")
 		private static WebElement voucherHeaderPDCNOTxt; */

	@FindBy(xpath="//div[@id='id_transactionentry_header1_section']/div/div[5]/div[2]/input")
	private static WebElement voucherHeaderPDCNOTxt; 





	@FindBy(xpath="//*[@id='90']/span")
	private static WebElement  convertMaturedPDCs;

	@FindBy(xpath="//div[@class='navText']//span[contains(text(),'Convert Matured PDCs')]")
	private static WebElement  convertMaturedPDCsLabel;


	@FindBy(xpath="//span[contains(text(),'Auto Postings')]")
	private static WebElement  autoPostingMenu;

	@FindBy(xpath="//*[@id='90']//span[contains(text(),'Convert Matured PDCs')]")
	private static WebElement  convertMaturedPDCSMenu;

	@FindBy(xpath="//input[@id='start_date']")
	private static WebElement asOnDateTxt;

	@FindBy(xpath="//input[@id='chkReassign']")
	private static WebElement reassignChkbox;

	@FindBy(xpath="//input[@id='chkPostOnDate']")
	private static WebElement postOnDateChkbox;

	@FindBy(xpath="//input[@id='post_date']")
	private static WebElement postOnDateTxt;

	@FindBy(xpath="//input[@id='chkSelectAll']")
	private static WebElement gridSelectAllOption;

	@FindBy(xpath="//input[@id='chkColumn']")
	private static WebElement gridSelectAllCOl;



	@FindBy(xpath="//input[@id='chkSelect1']")
	private static WebElement gridSelectRow1Chkbox;

	@FindBy(xpath="//input[@id='chkSelect3']")
	private static WebElement gridSelectRow3Chkbox;


	@FindBy(xpath="//input[@id='chkSelect2']")
	private static WebElement gridSelectRow2Chkbox;

	@FindBy(xpath="//input[@id='vNo1']")
	private static WebElement gridVoucherNoRow1Chkbox;

	@FindBy(xpath="//input[@id='vNo2']")
	private static WebElement gridVoucherNoRow2Chkbox;

	@FindBy(xpath="//input[@id='DateNo1']")
	private static WebElement gridVoucherDateRow1Chkbox;

	@FindBy(xpath="//input[@id='DateNo2']")
	private static WebElement gridVoucherDateRow2Chkbox;

	@FindBy(xpath="//i[@class='icon-font6 icon-clear']")
	private static WebElement convertMaturedPDCsClearIcon;

	@FindBy(xpath="//i[@class='icon-font6 icon-ok']")
	private static WebElement convertMaturedPDCsOkIcon;

	@FindBy(xpath="//span[@id='btnReportcancel']//i[@class='icon-cancel icon-font6']")
	private static WebElement convertMaturedPDCsCancelIcon;

	@FindBy(xpath="//div[contains(text(),'PDC Doc')]")
	private static WebElement gridPDCTxt;

	@FindBy(xpath="//div[contains(text(),'Converted Document')]")
	private static WebElement gridConvertedDocumentTxt;

	@FindBy(xpath="//div[contains(text(),'Bank')]")
	private static WebElement gridBankTxt;

	@FindBy(xpath="//th[@id='mytable_control_heading_7']//div[contains(text(),'Voucher No')]")
	private static WebElement gridVoucherNoTxt;

	@FindBy(xpath="//div[contains(text(),'Voucher Date')]")
	private static WebElement gridVoucherBodyTxt;

	@FindBy(xpath="//div[contains(text(),'Prefix')]")
	private static WebElement gridPrefixTxt;


	@FindBy(xpath="//input[@id='DepositingBank']")
	private static WebElement pdcVoucherDepositingBankDropdown;

	@FindBy(xpath="//input[@id='btnDepositingBank']")
	private static WebElement pdcVoucherApplyIcon;

	@FindBy(xpath="//i[@class='icon-custamize icon-font6']")
	private static WebElement pdcCustamizeIcon;

	@FindBy(xpath="//span[@id='btnOkToConvert']//i[@class='icon-font6 icon-ok']")
	private static WebElement pdcVoucherOkIcon;

	@FindBy(xpath="//span[@id='btnReportcancel']//i[@class='icon-close icon-font6']")
	private static WebElement pdcVoucherCancelIcon;

	@FindBy(xpath="//div[contains(text(),'Number')]")
	private static WebElement gridNumberTxt;

	@FindBy(xpath="//div[contains(text(),'Maturity Date')]")
	private static WebElement gridMatureDateTXt;

	@FindBy(xpath="//div[contains(text(),'Name')]")
	private static WebElement gridNameTxt;

	@FindBy(xpath="//div[contains(text(),'Applied Bank')]")
	private static WebElement gridAppliedBankTxt;

	@FindBy(xpath="//div[contains(text(),'Amount')]")
	private static WebElement gridAmountTxt;

	@FindBy(xpath="//div[contains(text(),'Reassigned V No')]")
	private static WebElement gridReassignesVoucherNoTxt;



	public boolean checkConvertedMaturePDCScreenWithNoPDCExists() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getDriver().navigate().refresh();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoPostingMenu));
		autoPostingMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCSMenu));
		convertMaturedPDCSMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSelectAllOption));
		gridSelectAllOption.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCsOkIcon));
		convertMaturedPDCsOkIcon.click();

		String expValidationMessage="No PDC's exists";

		String actValidationMessage=checkValidationMessage(expValidationMessage);

		if( actValidationMessage.equalsIgnoreCase(expValidationMessage))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcVoucherCancelIcon));
			pdcVoucherCancelIcon.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcVoucherCancelIcon));
			pdcVoucherCancelIcon.click();
			return false;
		}
	}





	@FindBy(xpath="//a[@id='2005']//span[contains(text(),'Post-Dated Receipts')]")
	private static WebElement postDatedRecepits;

	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  cashBankAccountTxt;


	@FindBy(xpath="//*[@id='id_body_12_table_body']/tr/td[2]")
	private static List<WebElement> accountListCount;


	@FindBy(xpath="//*[@id='id_body_16777346_table_body']/tr/td[2]")
	private static List<WebElement> taxcodelist;

	@FindBy(xpath="//*[@id='id_body_16777344_table_body']/tr/td[2]")
	private static List<WebElement> PDPVATtaxcodelist;




	//Post Dated Recepits 

	@FindBy(xpath="//*[@id='chkColumn_1']")
	private static WebElement pdcGridRow1Chkbox;

	@FindBy(xpath="//td[@id='mainTable_col_1-3']")
	private static WebElement pdcGridRow1Col3;

	@FindBy(xpath="//td[@id='mainTable_col_1-4']")
	private static WebElement pdcGridRow1Col4;

	@FindBy(xpath="//td[@id='mainTable_col_1-5']")
	private static WebElement pdcGridRow1Col5;

	@FindBy(xpath="//td[@id='mainTable_col_1-6']")
	private static WebElement pdcGridRow1Col6;

	@FindBy(xpath="//td[@id='mainTable_col_1-7']")
	private static WebElement pdcGridRow1Col7;

	@FindBy(xpath="//td[@id='mainTable_col_1-8']")
	private static WebElement pdcGridRow1Col8 ;

	@FindBy(xpath="//td[@id='mainTable_col_1-10']")
	private static WebElement pdcGridRow1Col9 ;




	@FindBy(xpath="//input[@id='chkColumn_2']")
	private static WebElement pdcGridRow2Chkbox;

	@FindBy(xpath="//td[@id='mainTable_col_2-3']")
	private static WebElement pdcGridRow2Col3;

	@FindBy(xpath="//td[@id='mainTable_col_2-4']")
	private static WebElement pdcGridRow2Col4;

	@FindBy(xpath="//td[@id='mainTable_col_2-5']")
	private static WebElement pdcGridRow2Col5;

	@FindBy(xpath="//td[@id='mainTable_col_2-6']")
	private static WebElement pdcGridRow2Col6;

	@FindBy(xpath="//td[@id='mainTable_col_2-7']")
	private static WebElement pdcGridRow2Col7;

	@FindBy(xpath="//td[@id='mainTable_col_2-8']")
	private static WebElement pdcGridRow2Col8 ;

	@FindBy(xpath="//td[@id='mainTable_col_2-10']")
	private static WebElement pdcGridRow2Col9 ;


	@FindBy(xpath="//input[@id='chkColumn_3']")
	private static WebElement pdcGridRow3Chkbox;

	@FindBy(xpath="//td[@id='mainTable_col_3-3']")
	private static WebElement pdcGridRow3Col3;

	@FindBy(xpath="//td[@id='mainTable_col_3-4']")
	private static WebElement pdcGridRow3Col4;

	@FindBy(xpath="//td[@id='mainTable_col_3-5']")
	private static WebElement pdcGridRow3Col5;

	@FindBy(xpath="//td[@id='mainTable_col_3-6']")
	private static WebElement pdcGridRow3Col6;

	@FindBy(xpath="//td[@id='mainTable_col_3-7']")
	private static WebElement pdcGridRow3Col7;

	@FindBy(xpath="//td[@id='mainTable_col_3-8']")
	private static WebElement pdcGridRow3Col8 ;

	@FindBy(xpath="//td[@id='mainTable_col_3-10']")
	private static WebElement pdcGridRow3Col9 ;


	@FindBy(xpath="//input[@id='chkColumn_4']")
	private static WebElement pdcGridRow4Chkbox;

	@FindBy(xpath="//td[@id='mainTable_col_4-3']")
	private static WebElement pdcGridRow4Col3;

	@FindBy(xpath="//td[@id='mainTable_col_4-4']")
	private static WebElement pdcGridRow4Col4;

	@FindBy(xpath="//td[@id='mainTable_col_4-5']")
	private static WebElement pdcGridRow4Col5;

	@FindBy(xpath="//td[@id='mainTable_col_4-6']")
	private static WebElement pdcGridRow4Col6;

	@FindBy(xpath="//td[@id='mainTable_col_4-7']")
	private static WebElement pdcGridRow4Col7;

	@FindBy(xpath="//td[@id='mainTable_col_4-8']")
	private static WebElement pdcGridRow4Col8 ;

	@FindBy(xpath="//td[@id='mainTable_col_4-10']")
	private static WebElement pdcGridRow4Col9 ;

	@FindBy(xpath="//span[contains(text(),'PDR VAT')]")
	private static WebElement PDRVAT ;



	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement newCashBankAccountTxt;

	@FindBy(xpath="//input[@id='id_header_6']")
	private static WebElement  voucherHeaderDueDate;

	@FindBy(xpath="//input[@id='id_header_10']")
	private static WebElement  voucherHeaderCurrency;

	@FindBy(xpath="//input[@id='id_header_145']")
	private static WebElement  voucherHeaderLocalExchangeRate;	

	@FindBy(xpath="//input[@id='id_header_11']")
	private static WebElement  voucherHeaderExchangeRate;



	@FindBy(xpath="//th[@id='id_transaction_entry_detail_table_control_heading_5']//div[contains(text(),'Exchange Diff')]")
	private static WebElement  gridExchangeDiffTxt;

	@FindBy(xpath="//div[contains(text(),'Local Exchange Diff')]")
	private static WebElement  gridLocalExchangeDiff;

	@FindBy(xpath="//div[contains(text(),'Account')]")
	private static WebElement gridAccTxt;

	@FindBy(xpath="//div[contains(text(),'Amount')]")
	private static WebElement gridAmtTxt;


	@FindBy(xpath="//div[contains(text(),'Reference')]")
	private static WebElement gridReferenceTxt;

	@FindBy(xpath="//div[contains(text(),'Remarks')]")
	private static WebElement vocbodyRemarksTxt;

	@FindBy(xpath="//div[contains(text(),'Tax Code')]")
	private static WebElement vocbodyTaxCodeTxt;


	@FindBy(xpath="//div[contains(text(),'VAT')]")
	private static WebElement vocbodyVATTxt;

	@FindBy(xpath="//div[contains(text(),'Amount')]")
	private static WebElement vocBodyAmountTxt;

	@FindBy(xpath="//div[contains(text(),'Remarks')]")
	private static WebElement vocBodyRemarksTxt;

	@FindBy(xpath="//div[contains(text(),'Account')]")
	private static WebElement vocBodyAccTxt;

	@FindBy(xpath="//div[contains(text(),'Debit')]")
	private static WebElement vocBodyDebitTxt;

	@FindBy(xpath="//div[contains(text(),'Credit')]")
	private static WebElement vocBodyCreditTxt;

	@FindBy(xpath="//div[contains(text(),'Reference')]")
	private static WebElement vocBodyReferenceTxt; 	

	@FindBy(xpath="//tbody[@id='id_header_268435460_table_body']/tr/td[2]")
	private static List<WebElement> wareHouseListCount;

	@FindBy(xpath="//*[@id='id_header_4_table_body']/tr/td[2]")
	private static List<WebElement>  cashAndBAnkAccountList;

	@FindBy(xpath="//tbody[@id='id_header_268435459_table_body']/tr/td[2]")
	private static List<WebElement> departmentListCount;

	@FindBy(xpath="//*[@id='id_header_268435470_table_body']/tr/td[2]")
	private static List<WebElement> placeOfSupplyList;


	@FindBy(xpath="//*[@id='id_header_268435471_table_body']/tr/td[2]")
	private static List<WebElement> jurdictionList;




	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr/td[3]")
	private static List<WebElement>  billwiseAdjustBillsDocList;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr/td[13]")
	private static List<WebElement>  billwiseAdjustBillsAdjustColumn;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr/td[2]/input")
	private static List<WebElement>  billwiseAdjustBillsChkBoxList;


	//Bill Reference Screen 	


	@FindBy(xpath="//input[@id='txtNewReference']")
	private static WebElement  billRefNewReferenceTxt;

	@FindBy(xpath="//input[@id='txtOnAccount']")
	private static WebElement  billRefTxtOnAccount;		

	@FindBy(xpath="//input[@id='Searchtxt']")
	private static WebElement  billRefSearchTxt;		

	@FindBy(xpath="//select[@id='cbmShowBillForAdjustment']")
	private static WebElement  billRefNewReferenceDropdown;		

	@FindBy(xpath="//select[@id='cbmShowBills']")
	private static WebElement  billRefShowBillsDropdown;		

	@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_11']//div[contains(text(),'Due Date')]")
	private static WebElement  billRefGridHeaderDueDate;		

	@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_16']//div[contains(text(),'Currency')]")
	private static WebElement  billRefGridHeaderCurrency;		

	@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_21']//div[contains(text(),'Original Amt')]")
	private static WebElement  billRefGridHeaderOrginalAmt;		

	@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_23']//div[contains(text(),'Balance Amount')]")
	private static WebElement  billRefGridHeaderBalanceAmt;		

	@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_33']//div[contains(text(),'Adjustment Amount')]")
	private static WebElement  billRefGridHeaderAdjustmentAmt;		

	@FindBy(xpath="//div[contains(text(),'Native Currency')]")
	private static WebElement  billRefGridHeaderNativeCurrency;		

	@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_41']//div[contains(text(),'Narration')]")
	private static WebElement  billRefGridHeaderNarration;		

	@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_50']//div[contains(text(),'Previous Adjustment Amount')]")
	private static WebElement  billRefGridHeaderPreviosAdjustmentAmt;		

	@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_1-0']")
	private static WebElement  billRefGridFirstRow;	

	@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_1-1']//input")
	private static WebElement  billRefGridFirstRowChkbox;		

	@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_2-1']//input")
	private static WebElement  billRefGridSecondRowChkbox;		

	@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_3-1']//input")
	private static WebElement  billRefGridThirdRowChkbox;		

	/*@FindBy(xpath="//tbody[@id='id_Adjustment_Grid_body']//td[13]")
		private static WebElement  billRefGridFirstRowAdjustmentAmtTxt;		
	 */             
	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[13]")
	private static WebElement  billRefGridFirstRowAdjustmentAmtTxt;		

	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[13]")
	private static WebElement  billRefGridSecondRowAdjustmentAmtTxt;		

	@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_3-33']")
	private static WebElement  billRefGridThirdRowAdjustmentAmtTxt;		

	@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_1-41']")
	private static WebElement  billRefGridFirstNarrationTxt;		

	@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_2-41']")
	private static WebElement  billRefGridSecondNarrationTxt;		

	@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_3-41']")
	private static WebElement  billRefGridThirdNarrationTxt;		

	@FindBy(xpath="//input[@id='id_Narration']")
	private static WebElement  narrationToWrite;		

	@FindBy(xpath="//input[@id='id_limit']")
	private static WebElement  adjustAmtToWrite;		

	@FindBy(xpath="//div[@class='col-xs-6 navbar-header']//div[@class='navText']")
	private static WebElement  billRefPaymentsBillReferenceLabel;		

	@FindBy(xpath="//div[@class='col-sm-12 col-md-3']//input[@class='Fbutton']")
	private static WebElement  billRefAdjustOnFIFOBtn;		

	@FindBy(xpath="//span[@id='btnPick']")
	private static WebElement  billRefPickIcon;		

	@FindBy(xpath="//span[@id='btnOk']")
	private static WebElement  billRefOkBtn;		

	@FindBy(xpath="//span[@id='btnCancel']")
	private static WebElement  billRefcancel;		

	@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_net']")
	private static WebElement  billRefSummatyValueNet;		

	@FindBy(xpath="//td[@id='AccountAmount_col_1-1']")
	private static WebElement  billRefGridVendorRow1;	

	@FindBy(xpath="//td[@id='AccountAmount_col_1-2']")
	private static WebElement  billRefGridVendorAmtRow1;	

	@FindBy(xpath="//td[@id='AccountAmount_col_2-1']")
	private static WebElement  billRefGridVendorRow2;	

	@FindBy(xpath="//td[@id='AccountAmount_col_2-2']")
	private static WebElement  billRefGridVendorAmtRow2;	

	@FindBy(xpath="//td[@id='AccountAmount_col_3-1']")
	private static WebElement  billRefGridVendorRow3;

	@FindBy(xpath="//label[@id='tbNewRefAmountAdjValue']")
	private static WebElement amtAdjustedAgainstNewREfinOtherVouchers;

	@FindBy(xpath="//label[@id='tbAmountToAdjustInTransCurrencyValue']")
	private static WebElement transactionCurency;

	@FindBy(xpath="//label[@id='tbAmountToAdjustInBaseCurrencyValue']")
	private static WebElement baseCurrency;

	@FindBy(xpath="//label[@id='tbAmountToAdjustInLocalCurrencyValue']")
	private static WebElement localCurrencyDhs;

	@FindBy(xpath="//label[@id='tbNewRefBalAmountValue']")
	private static WebElement balanceNewReferenceAmt;

	@FindBy(xpath="//li[@id='id_li_Adjustment_Tab_BreakUpByTag']//span[@class='font-5'][contains(text(),'Break Up by Tag')]")
	private static WebElement breakUpByTagTab;

	@FindBy(xpath="//span[@class='font-5'][contains(text(),'Adjustment')]")
	private static WebElement adjustmentTab;

	@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-9']")
	private static WebElement breakUpByTagDueDate;

	@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-10']")
	private static WebElement breakUpByTagDepartment;

	@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-18']")
	private static WebElement breakUpByTagBaseCurrency;

	@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-17']")
	private static WebElement breakUpByTagBillCurrency;

	@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-20']")
	private static WebElement breakUpByTagBaseConversionRate;

	@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-21']")
	private static WebElement breakUpByTagBaseLocalCurrency;

	@FindBy(xpath="//label[@id='txtblkAmountadjusted']")
	private static WebElement  billRefAdjustAmountInTransCurency;

	@FindBy(xpath="//label[@id='txtblkAmounttobeadjust']")
	private static WebElement  billRefBalanceAmountAdjustInTrnasCurrency;

	@FindBy(xpath="//label[@id='id_BillWise_IP_LocalConversionRateValue']")
	private static WebElement  billRefInfoBarLocalCurrencyRate;


	@FindBy(xpath="//label[@id='tbAmountToAdjustInTransCurrencyValue']")
	private static WebElement billRefTransactionCurency;

	@FindBy(xpath="//label[@id='tbAmountToAdjustInBaseCurrencyValue']")
	private static WebElement billRefBaseCurrency;


	@FindBy(xpath="//label[@id='id_BillWise_IP_AccountName']")
	private static WebElement breakUpDetailsAccount;

	@FindBy(xpath="//label[@id='id_BillWise_IP_ProductName']")
	private static WebElement breakUpDetailsItem;

	@FindBy(xpath="//label[@id='id_BillWise_IP_TagName']")
	private static WebElement breakUpDetailsDepartment;

	@FindBy(xpath="//label[@id='id_BillWise_IP_BaseCurrencyValue']")
	private static WebElement conversationRateBaseCurrencyRate;

	@FindBy(xpath="//label[@id='id_BillWise_IP_LocalConversionRateValue']")
	private static WebElement conversationRateLocalCurrencyRate;

	@FindBy(xpath="//label[@id='id_infoPanel_lblAEDTranAmountValue']")
	private static WebElement asOnEntryDateTransAmt;

	@FindBy(xpath="//label[@id='id_infoPanel_lblAEDBaseConversionValue']")
	private static WebElement asOnEntryDateBaseConcersationRate;

	@FindBy(xpath="//label[@id='id_infoPanel_lblAEDBaseAmountValue']")
	private static WebElement asOnEntryDateBaseAmount;

	@FindBy(xpath="//label[@id='id_infoPanel_lblAEDLocalConversionValue']")
	private static WebElement asOnEntryDateLocConversationRate;

	@FindBy(xpath="//label[@id='id_infoPanel_lblAEDLocalAmountValue']")
	private static WebElement asOnEntryDateAmt;

	@FindBy(xpath="//label[@id='id_infoPanel_lblAADTranAmountValue']")
	private static WebElement balOnAdjstDateTransAmt;

	@FindBy(xpath="//label[@id='id_infoPanel_lblAADBaseConversionValue']")
	private static WebElement  balOnAdjstDateBasrConversionRate;

	@FindBy(xpath="//label[@id='id_infoPanel_lblAADBaseAmountValue']")
	private static WebElement  balOnAdjstDateBaseAmount;

	@FindBy(xpath="//label[@id='id_infoPanel_lblAADLocalConversionValue']")
	private static WebElement  balOnAdjstDateLocalConversionRate;

	@FindBy(xpath="//label[@id='id_infoPanel_lblAADLocalAmountValue']")
	private static WebElement  balOnAdjstDateAmt;

	@FindBy(xpath="//label[@id='id_infoPanel_lblAdjTranAmountValue']")
	private static WebElement adjustmentsAmount1;

	@FindBy(xpath="//label[@id='id_infoPanel_lblAdjBaseAmountValue']")
	private static WebElement adjustmentsAmount2;

	@FindBy(xpath="//label[@id='id_infoPanel_lblAdjLocalAmountValue']")
	private static WebElement adjustmentsAmount3;

	@FindBy(xpath="//label[@id='id_infoPanel_lblNativeCurrencyValue']")
	private static WebElement adjustmentsAmount4;

	@FindBy(xpath="//label[@id='id_infoPanel_lblExDiffTranAmountValue']")
	private static WebElement exchangeGainLossForBaseCurrency;

	@FindBy(xpath="//label[@id='id_infoPanel_lblExDiffLocalAmountValue']")
	private static WebElement exchangeGainLossForLocalCurrency;



	@FindBy(xpath="//input[@id='id_limit']")
	private static WebElement gridEnterAdjustAmtRow1;

	//Billreference Body Grid Elements



	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[1]/td[8]")
	private static WebElement gridOrginalAmtRow1;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[2]/td[8]")
	private static WebElement gridOrginalAmtRow2;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[3]/td[8]")
	private static WebElement gridOrginalAmtRow3;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[4]/td[8]")
	private static WebElement gridOrginalAmtRow4;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[5]/td[8]")
	private static WebElement gridOrginalAmtRow5;




	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[1]/td[10]")
	private static WebElement gridBalanceAmtRow1;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[2]/td[10]")
	private static WebElement gridBalanceAmtRow2;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[3]/td[10]")
	private static WebElement gridBalanceAmtRow3;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[4]/td[10]")
	private static WebElement gridBalanceAmtRow4;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[5]/td[10]")
	private static WebElement gridBalanceAmtRow5;



	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[1]/td[13]")
	private static WebElement gridAdjustmentAmtRow1;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[2]/td[13]")
	private static WebElement gridAdjustmentAmtRow2;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[3]/td[13]")
	private static WebElement gridAdjustmentAmtRow3;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[4]/td[13]")
	private static WebElement gridAdjustmentAmtRow4;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[5]/td[13]")
	private static WebElement gridAdjustmentAmtRow5;



	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr")
	private static List<WebElement> billRefAdjustBillsGrid;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[1]/td[3]")
	private static WebElement billRefAdjustBillsRow1DocNo;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[2]/td[3]")
	private static WebElement billRefAdjustBillsRow2DocNo;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[3]/td[3]")
	private static WebElement billRefAdjustBillsRow3DocNo;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[4]/td[3]")
	private static WebElement billRefAdjustBillsRow4DocNo;

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[5]/td[3]")
	private static WebElement billRefAdjustBillsRow5DocNo;



	@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr/td[2]")
	private static WebElement InfoSideBarDocRow1;

	@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr/td[3]")
	private static WebElement InfoSideBarAmtRow1;

	@FindBy(xpath="//tbody[@id='InfPnlAdjGrd_body']//td[4]")
	private static WebElement InfoSideBarBaseAmtRow1;

	// Row 2

	@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr[2]/td[2]")
	private static WebElement InfoSideBarDocRow2;

	@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr[2]/td[3]")
	private static WebElement InfoSideBarAmtRow2;

	@FindBy(xpath="//tbody[@id='InfPnlAdjGrd_body']//tr[2]//td[4]")
	private static WebElement InfoSideBarBaseAmtRow2;

	// Row 3

	@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr[3]/td[2]")
	private static WebElement InfoSideBarDocRow3;

	@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr[3]/td[3]")
	private static WebElement InfoSideBarAmtRow3;

	@FindBy(xpath="//tbody[@id='InfPnlAdjGrd_body']//tr[3]//td[4]")
	private static WebElement InfoSideBarBaseAmtRow3;


	// Row 4 

	@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr[4]/td[2]")
	private static WebElement InfoSideBarDocRow4;

	@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr[4]/td[3]")
	private static WebElement InfoSideBarAmtRow4;

	@FindBy(xpath="//tbody[@id='InfPnlAdjGrd_body']//tr[4]//td[4]")
	private static WebElement InfoSideBarBaseAmtRow4;

	// row 5

	@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr[5]/td[2]")
	private static WebElement InfoSideBarDocRow5;

	@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr[5]/td[3]")
	private static WebElement InfoSideBarAmtRow5;

	@FindBy(xpath="//tbody[@id='InfPnlAdjGrd_body']//tr[5]//td[4]")
	private static WebElement InfoSideBarBaseAmtRow5;


	@FindBy(xpath="//*[@id='id_body_12_table_body']/tr/td[2]")
	private static List<WebElement> openingBalAccountListInGrid;

	@FindBy(xpath="//input[@id='id_body_19']")
	private static WebElement  enter_OBCreditACTxt;

	@FindBy(xpath="//*[@id='lblAccount']")
	private static WebElement  billRefPartyName;

	@FindBy(xpath="//input[@id='misc_PostingUpdateFA']")
	private static WebElement  updateFAChkbox;



	//PostDatedReceipts


	public boolean checkpostDatedRecepitsCustomizationOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{




		//Thread.sleep(4000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDRVAT));
		PDRVAT.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();


		checkUserFriendlyMessage();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();

		//Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingBtn));
		settingBtn.click();

		//Thread.sleep(2000);
		settingMiscellaneousTab.click();

		//Thread.sleep(2000);

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateFAChkbox));
		    if(updateFAChkbox.isSelected()==false)
		    {
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateFAChkbox));
			    updateFAChkbox.click();


		    }*/

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingUpdateIcon));
		settingUpdateIcon.click();

		String expValidationMessage="Data saved successfully";

		String actValidationMessage=checkValidationMessage(expValidationMessage);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingCloseIcon));
		settingCloseIcon.click();

		if(actValidationMessage.equalsIgnoreCase(expValidationMessage))
		{
			System.out.println("****Test Pass : Data Updated Successfully in Header Feild OF Post Dated Receipts *********");
			return true;
		}
		else
		{
			System.err.println("****Test Fail : Data  Not Updated Successfully*********");
			return false;
		}

	}



	public boolean checkSavingVoucherToPostDatedReceipts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getDriver().navigate().refresh();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDRVAT));
		PDRVAT.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		checkUserFriendlyMessage();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		documentNumberTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		newCashBankAccountTxt.click();

		newCashBankAccountTxt.sendKeys(Keys.SPACE);

		int cashAndBAnkAccountListCount  = cashAndBAnkAccountList.size();

		for (int i = 0; i < cashAndBAnkAccountListCount; i++) 
		{
			String data	= cashAndBAnkAccountList.get(i).getText();

			if(data.equalsIgnoreCase("Bank"))
			{
				cashAndBAnkAccountList.get(i).click();

				break;
			}
		}

		newCashBankAccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));

		departmentTxt.sendKeys(Keys.SPACE);

		int departmentcount=departmentListCount.size();

		System.err.println(departmentcount);

		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();

			if(data.equalsIgnoreCase("INDIA"))
			{
				departmentListCount.get(i).click();

				break;
			}
		}

		departmentTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDRVATPlaceOfSupplyTXt));
		PDRVATPlaceOfSupplyTXt.click();
		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.END);
		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.SHIFT,Keys.HOME);
		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.SPACE);

		int placeOfSupplyListCount=placeOfSupplyList.size();

		for (int j = 0; j < placeOfSupplyListCount; j++) 
		{
			String data=placeOfSupplyList.get(j).getText();

			if (data.equalsIgnoreCase("Abu Dhabi"))
			{
				placeOfSupplyList.get(j).click();

			}

		}

		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.TAB);

		PDRVAT_JuridictionTxt.sendKeys(Keys.END);
		PDRVAT_JuridictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);

		PDRVAT_JuridictionTxt.sendKeys(Keys.SPACE);

		int jurdictionListCount=jurdictionList.size();

		for (int k = 0; k < jurdictionListCount; k++) 
		{
			String data=jurdictionList.get(k).getText();

			if (data.equalsIgnoreCase("Abu Dhabi"))
			{
				jurdictionList.get(k).click();

			}

		}
		PDRVAT_JuridictionTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys(Keys.SPACE);

		int accountCount=accountListCount.size();

		System.err.println(accountCount);

		for(int i=0 ; i < accountCount ;i++)
		{
			String data=accountListCount.get(i).getText();

			if(data.equalsIgnoreCase("Customer A"))
			{
				accountListCount.get(i).click();

				break;
			}
		}

		enter_AccountTxt.sendKeys(Keys.TAB);


		enterTaxcode.click();
		enterTaxcode.sendKeys(Keys.SHIFT,Keys.HOME);
		enterTaxcode.sendKeys("STD");
		Thread.sleep(2000);

		enterTaxcode.sendKeys(Keys.TAB);

		enter_Amount.click();
		enter_Amount.clear();
		enter_Amount.sendKeys("5");
		enter_Amount.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
		String actPartyName = billRefPartyName.getText();
		String expPartyName = "Customer A (122-001)";

		System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		billRefNewReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		String actbillRefNewReferenceTxt=billRefNewReferenceTxt.getAttribute("value");
		String expbillRefNewReferenceTxt="5.00";

		System.err.println(" billRefNewReferenceTxt : "+actbillRefNewReferenceTxt +" Value Expected : "+expbillRefNewReferenceTxt);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		/*HashSet<String> actMessage = new HashSet<String>();

		for (int i = 0; i < 2; i++) 
		{
			String data = checkValidationMessage("");
			actMessage.add(data);
		}

		HashSet<String> expMessage = new HashSet<String>();

		expMessage.add("Voucher saved successfully : "+docno);
		expMessage.add("Saving in background.");

		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage);*/
		
		String expMessage1 = "Voucher saved successfully";

		String actMessage = checkValidationMessage(expMessage1);
		String expMessage2 = ": "+docno;

				
		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage1);

	//	if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) )

		
		if(actbillRefNewReferenceTxt.equalsIgnoreCase(expbillRefNewReferenceTxt) && 
				actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
	
	
	

	public boolean checkSavedVoucherInPDRVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		previousBtn.click();

		boolean loading=checkLoadingMessage();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String actDocNo=documentNumberTxt.getAttribute("value");
		String expDocNo="1";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();

		String actDate=dateTxt.getAttribute("value");
		String expDate=maturityDateTxt.getAttribute("value");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashBankAccountTxt));
		cashBankAccountTxt.click();

		String actAccount=cashBankAccountTxt.getAttribute("value");
		String expAccount="Bank";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
		voucherHeaderCurrency.click();

		String actCurrency=voucherHeaderCurrency.getAttribute("value");
		String expCurrency="INR";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderExchangeRate));
		voucherHeaderExchangeRate.click();

		String actExchangeRate=voucherHeaderExchangeRate.getAttribute("value");
		String expExchangeRate="1.0000000000";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();

		String actdepartment=departmentTxt.getAttribute("value");
		String expdepartment="INDIA";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderLocalExchangeRate));
		voucherHeaderLocalExchangeRate.click();

		String actLocalExchangeRate=voucherHeaderLocalExchangeRate.getAttribute("value");
		String expLocalExchangeRate="0.0700000000";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		String actGridAccount=select1stRow_1stColumn.getText();
		String expGridAccount="Customer A";

		String actTaxCode=select1stRow_2ndColumn.getText();
		String expTaxCode="STD Rate";


		String actAmount=select1stRow_3rdColumn.getText();
		String expAmount="5.00";

		System.out.println("**************************************checkSavedVoucherInPDRVAT******************");

		System.out.println(" Loading Message   : "+loading            +" Value Expected :  "+true);
		System.out.println("DocNo              : "+actDocNo           +" Value Expected  : "+expDocNo);
		System.out.println("Date               : "+actDate            +" Value Expected  : "+expDate);
		System.out.println("Account            : "+actAccount         +" Value Expected  : "+expAccount);
		System.out.println("Currency           :"+actCurrency         +" Value Expected  : "+expCurrency);
		System.out.println("ExchangeRate       :"+actExchangeRate     +" Value Expected  : "+expExchangeRate);
		System.out.println("department         :"+actdepartment       +" Value Expected  : "+expdepartment);
		System.out.println("LocalExchangeRate  :"+actLocalExchangeRate+" Value Expected  :"+expLocalExchangeRate);
		System.out.println("TaxCode           :"+actTaxCode           +" Value Expected  : "+expTaxCode);
		System.out.println("GridAccount        :"+actGridAccount      +" Value Expected  : "+expGridAccount);
		System.out.println("Amount             :"+actAmount           +" Value Expected  : "+expAmount);

		if (actDocNo.equalsIgnoreCase(expDocNo) && actDate.equalsIgnoreCase(expDate) && actAccount.equalsIgnoreCase(expAccount) &&
				actCurrency.equalsIgnoreCase(expCurrency)&& actExchangeRate.equalsIgnoreCase(expExchangeRate)&& 
				actdepartment.equalsIgnoreCase(expdepartment) && actLocalExchangeRate.equalsIgnoreCase(expLocalExchangeRate) && 
				actTaxCode.equalsIgnoreCase(expTaxCode)&&
				actGridAccount.equalsIgnoreCase(expGridAccount) && actAmount.equalsIgnoreCase(expAmount) ) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}



	@FindBy(xpath="//input[@id='id_header_67108933']")
	private static WebElement  PDRVATChequeNoTxt;

	public boolean checkEditingVoucherAndSavingInPDRVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDRVATChequeNoTxt));
		PDRVATChequeNoTxt.click();
		PDRVATChequeNoTxt.sendKeys("PDR1");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String actPDRVATChequeNoTxt=PDRVATChequeNoTxt.getAttribute("value");
		String expPDRVATChequeNoTxt="PDR1";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_3rdColumn));
		select1stRow_3rdColumn.click();
		enter_Amount.sendKeys(Keys.CLEAR);
		enter_Amount.sendKeys("6");
		enter_Amount.sendKeys(Keys.TAB);

		String actAmount=select1stRow_3rdColumn.getText();
		String expAmount="6.00";

		System.out.println("***************************checkEditingVoucherAfterSavingInPDRVAT*************");

		System.out.println("PDRVATChequeNoTxt           :"+actPDRVATChequeNoTxt +" Value Expected  : "+expPDRVATChequeNoTxt);
		System.out.println("Amount                       :"+actAmount           +" Value Expected  : "+expAmount);

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		billRefNewReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		/*HashSet<String> actMessage = new HashSet<String>();

		for (int i = 0; i < 2; i++) 
		{
			String data = checkValidationMessage("");
			actMessage.add(data);
		}

		HashSet<String> expMessage = new HashSet<String>();

		expMessage.add("Voucher saved successfully : "+docno);
		expMessage.add("Saving in background.");

		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage);
*/
		
		String expMessage1 = "Voucher saved successfully";

		String actMessage = checkValidationMessage(expMessage1);
		String expMessage2 = ": "+docno;

				
		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage1);

	//	if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) )
		
		if (actAmount.equalsIgnoreCase(expAmount)  && actPDRVATChequeNoTxt.equalsIgnoreCase(expPDRVATChequeNoTxt) && 
				actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) ) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}


	@FindBy(xpath="//*[@id='mytable_body']/tr/td[3]")
	private static List<WebElement> pdcCheckBoxlist;

	@FindBy(xpath="//*[@id='mytable_body']/tr/td[4]")
	private static List<WebElement> pdcDOClist;

	@FindBy(xpath="//*[@id='mytable_body']/tr/td[6]")
	private static List<WebElement> pdcBanklist;

	@FindBy(xpath="//a[@id='25']//span[contains(text(),'Data Management')]")
	private static WebElement  dataManagementMenu;

	@FindBy(xpath="//span[contains(text(),'Reindex')]")
	private static WebElement  reindexMenu;

	@FindBy(xpath="//input[@id='chk_fullReindex']")
	private static WebElement  fullReindexChkBox;

	@FindBy(xpath="//span[@class='icon-ok icon-font6']")
	private static WebElement  reindexOkBtn;

	@FindBy(xpath="//div[@class='col-sm-12 btnheader_img']//span[@class='icon-close icon-font6']")
	private static WebElement  reindexCancelBtn;

	@FindBy(xpath="//div[@id='idGlobalError']")
	public static WebElement validationConfirmationMessage;




	public boolean checkSavedVouchersInPDCVoucherScreenWithOutPostOnDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoPostingMenu));
		autoPostingMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCSMenu));
		convertMaturedPDCSMenu.click();

		int pdcDOClistCount=pdcDOClist.size();

		for (int i = 0; i < pdcDOClistCount; i++) 
		{
			String data=pdcDOClist.get(i).getText();
			if (data.equalsIgnoreCase("PDR VAT"))
			{
				pdcCheckBoxlist.get(i).click();
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCsOkIcon));
		convertMaturedPDCsOkIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcGridRow1Chkbox));
		pdcGridRow1Chkbox.click();

		String actNumber=pdcGridRow1Col3.getText();
		String expNumber="1";


		String actMaturityDate=pdcGridRow1Col4.getText();
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date date=new Date();
		String CurrentDate=df.format(date);
		String expMaturityDate=CurrentDate;

		String actName=pdcGridRow1Col5.getText();
		String expName="Bank";


		String actAmount=pdcGridRow1Col7.getText();
		String expAmount="6.00";

		String actReassignedVouNo=pdcGridRow1Col8.getText();
		String expReassignedVouNo="1";

		System.out.println("******************checkSavedVouchersInPDCVoucherScreenWithOUTPostOnDate********************************");
		System.out.println(" Number         : "+actNumber           +" Value Expected  : "+expNumber);
		System.out.println("Name            : "+actName             +" Value Expected  : "+expName);
		System.out.println("Amount          : "+actAmount           +" Value Expected  : "+expAmount);
		System.out.println("ReassignedVouNo : " +actReassignedVouNo +" Value Expected  : "+expReassignedVouNo);


		if (actNumber.equalsIgnoreCase(expNumber) && actMaturityDate.equalsIgnoreCase(expMaturityDate)&&
				actName.equalsIgnoreCase(expName) &&actAmount.equalsIgnoreCase(expAmount) &&  actReassignedVouNo.equalsIgnoreCase(expReassignedVouNo))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

	@FindBy(xpath="//*[@id='userprofile']/li/span[2]")
	private static WebElement logoutOption;



	public boolean checkConvertingVouchersInPDCVoucherScreenWithOutPostOnDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcVoucherOkIcon));
		pdcVoucherOkIcon.click();

		String expValidationMessage="Create PDCNo Field in Header Of Receipts Voucher";

		String actValidationMessage=checkValidationMessage(expValidationMessage);

		if (actValidationMessage.equalsIgnoreCase(expValidationMessage) )
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}





	//Receipts

	public boolean checkAddExtraFieldPDCInHeaderFieldOFReceipts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVoucher));
		receiptsVoucher.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsBtn));
		settingsBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTab));
		editLayoutTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutAddFieldsBtn));
		editLayoutAddFieldsBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutCaptionTxt));
		editLayoutCaptionTxt.click();
		editLayoutCaptionTxt.sendKeys("PDCNO");
		editLayoutCaptionTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutApplyBtn));
		editLayoutApplyBtn.click();
		Thread.sleep(1000);

		checkValidationMessage(" ");

		Thread.sleep(3000);

		for (int i = 0; i < 5; i++) 
		{
			if (getIsAlertPresent()==true) 
			{
				getAlert().accept();
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingUpdateIcon));
		settingUpdateIcon.click();

		for (int i = 0; i < 5; i++) 
		{
			if (getIsAlertPresent()==true) 
			{
				getAlert().accept();
			}
		}

		String expValidationMessage="Data saved successfully";

		String actValidationMessage=checkValidationMessage(expValidationMessage);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settings_closeBtn));
		settings_closeBtn.click();
		
		Thread.sleep(2000);

		if (actValidationMessage.equalsIgnoreCase(expValidationMessage) )
		{
			return true;
		}
		else
		{
			return false;
		}

	}





	@FindBy(xpath="//tbody//input[@placeholder='Value']")
	private static WebElement pdcVoucherFilterDateTxt;

	@FindBy(xpath="//input[@id='advancefilter_date_90_0']")
	private static WebElement enter_PDCFilterDate;

	@FindBy(xpath="//button[@id='btnFilterPDCDetails']")
	private static WebElement pdcVoucherFilterBtn;



	public boolean checkCovertingVoucherInPDC() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoPostingMenu));
		autoPostingMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCSMenu));
		convertMaturedPDCSMenu.click();

		int pdcDOClistCount=pdcDOClist.size();

		for (int i = 0; i < pdcDOClistCount; i++) 
		{
			String data=pdcDOClist.get(i).getText();
			
			if (data.equalsIgnoreCase("PDR VAT"))
			{
				pdcCheckBoxlist.get(i).click();

			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCsOkIcon));
		convertMaturedPDCsOkIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcGridRow1Chkbox));
		pdcGridRow1Chkbox.click();

		boolean getGridSelectRow1Chkbox=pdcGridRow1Chkbox.isSelected();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcVoucherOkIcon));
		pdcVoucherOkIcon.click();

		String expValidationMessage="Voucher converted successfully";

		String actValidationMessage=checkValidationMessage(expValidationMessage);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcVoucherCancelIcon));
		pdcVoucherCancelIcon.click();

		if (getGridSelectRow1Chkbox==true && actValidationMessage.equalsIgnoreCase(expValidationMessage))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}



	@FindBy(xpath="//*[@id='id_transactionentry_footer_panel_summary_value_net']/span[2]")
	private static WebElement recepitsFooterAmt;

	public boolean checkConvertedPDCVoucherInReceipts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVoucher));
		receiptsVoucher.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
		getAction().doubleClick(grid_ChkBox1).click().build().perform();

		boolean loading=checkLoadingMessage();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String actDocno             = documentNumberTxt.getAttribute("value");
		String actVouDate           = dateTxt.getAttribute("value");
		String actDepartment        = departmentTxt.getAttribute("value");
		String actChequeNo          = receipts_ChequeNoTxt.getAttribute("value");
		String actPDCNo             = voucherHeaderPDCNOTxt.getAttribute("value");
		String actAccount           = select1stRow_1stColumn.getText();
		String actAmount            = select1stRow_2ndColumn.getText();
		String actref               = select1stRow_3rdColumn.getText();

		String expDocno              = "1";
		String expCurrency           ="INR";
		String expDepartment         ="INDIA";
		String expPDCNo              ="1";

		String expChequeNo           ="PDR1";
		String expAccount            ="Customer A";
		String expAmount             ="6.00";
		String expref                ="New Reference";

		String actFooterAmt   =recepitsFooterAmt.getText();
		String expFooterAmt   ="6.00";

		System.out.println("Entry Page Document Number    "+actDocno       +"  value Expected  "+expDocno);
		System.out.println("Entry Page ChequeNoTxt        "+actChequeNo    +"  value Expected  "+expChequeNo);
		System.out.println("Entry Page Department         "+actDepartment  +"  value Expected  "+expDepartment);
		System.out.println("Entry Page Account            "+actAccount     +"  value Expected  "+expAccount);
		System.out.println("Entry Page Amount             "+actAmount      +"  value Expected  "+expAmount);
		System.out.println("Entry Page Reference          "+actref         +"  value Expected  "+expref);
		System.out.println("Entry Page  PDC Number        "+actPDCNo       +"  value Expected  "+expPDCNo);
		System.out.println("Entry Page Footer  Amount     "+actFooterAmt   +"  Value Expected  "+expFooterAmt);

		if (actDocno.equalsIgnoreCase(expDocno) && actDepartment.equalsIgnoreCase(expDepartment) && 
				actAccount.equalsIgnoreCase(expAccount) && actChequeNo.equalsIgnoreCase(expChequeNo) && actref.startsWith(expref) && actAmount.equalsIgnoreCase(expAmount) && 
				actFooterAmt.equalsIgnoreCase(expFooterAmt) && actPDCNo.equalsIgnoreCase(expPDCNo) )
		{
			return true;
		}
		else
		{
			return false;
		}
	}




	public boolean checkDeleteOfConvertedVoucherinRecepits() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_DeleteBtn));
		new_DeleteBtn.click();

		getWaitForAlert();

		getAlert().accept();

		String expValidationMessage="Voucher deleted Successfully";

		String actValidationMessage=checkValidationMessage(expValidationMessage);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();

		if (actValidationMessage.equalsIgnoreCase(expValidationMessage)) 
		{
			return true;
		}
		else
		{
			return false;
		}

	}

	@FindBy(xpath="//span[contains(text(),'Auto Postings')]")
	private static WebElement  financialsTransactionsAutoPostingsMenu;

	public boolean checkClickOnConvertedPDCVouchersAfterDeletionOfConvertedVoucherInRecepits() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsAutoPostingsMenu));
		financialsTransactionsAutoPostingsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCs));
		convertMaturedPDCs.click();

		int pdcDOClistCount=pdcDOClist.size();

		for (int i = 0; i < pdcDOClistCount; i++) 
		{
			String data=pdcDOClist.get(i).getText();
			
			if (data.equalsIgnoreCase("PDR VAT"))
			{
				pdcCheckBoxlist.get(i).click();
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCsOkIcon));
		convertMaturedPDCsOkIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcGridRow1Col3));
		String actRow1Number=pdcGridRow1Col3.getText();
		String expRow1Number="1";

		if (actRow1Number.equalsIgnoreCase(expRow1Number))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcGridRow1Chkbox));
			pdcGridRow1Chkbox.click();

			boolean getGridSelectRow1Chkbox=pdcGridRow1Chkbox.isSelected();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcVoucherOkIcon));
			pdcVoucherOkIcon.click();

			checkUserFriendlyMessage();

			return true;
		}
		else
		{
			System.err.println(" Test Fail: Deleted Voucher in Receipts  is Not   Appered in PDC Voucher Screen ");
			return false;
		}

	}


	//Reverse Posting  in Post Dated Receipts 
	@FindBy(xpath="//*[@id='16']/div/div")
	private static WebElement  settingsMenu;  


	@FindBy(xpath="//span[contains(text(),'Configure Transactions')]")
	private static WebElement  settingsConfigureTransactions;

	@FindBy(xpath="//a[@id='5']")
	private static WebElement  PDCMenu;

	@FindBy(xpath="//input[@id='chkPostDatedCheques']")
	private static WebElement pdcPostDatedChequeChkbox;

	@FindBy(xpath="//input[@id='chkAutoCheckMaturedPDC']")
	private static WebElement pdcAutoCheckforMaturedChkbox ;

	@FindBy(xpath="//input[@id='gphDisplayInLedger']")
	private static WebElement pdcDisplayinLedgerChkbox;

	@FindBy(xpath="//input[@id='chkReverseACPostPDCConversion']")
	private static WebElement pdcReseverseAccountpostingOnPDCConversionChkbox;

	@FindBy(xpath="//input[@id='PDCDiscountedAccount']")
	private static WebElement pdcCheckDiscountingTxt;

	@FindBy(xpath="//input[@id='PDCDiscountedVoucherType']")
	private static WebElement pdcChequeDiscountingVoucherType;


	public boolean checkUpdateinPDCUnderSettingMenuForEnableReversePostingInRecepits() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureTransactions));
		settingsConfigureTransactions.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDCMenu));
		PDCMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcReseverseAccountpostingOnPDCConversionChkbox));
		if (pdcReseverseAccountpostingOnPDCConversionChkbox.isSelected()==false) 
		{
			pdcReseverseAccountpostingOnPDCConversionChkbox.click();
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
		updateBtn.click();

		getWaitForAlert();

		String actAlert = getAlert().getText();
		String expAlert= "Do you want to save the changes?";

		getAlert().accept();

		String expValidationMessage="Data saved Successfully";

		String actValidationMessage=checkValidationMessage(expValidationMessage);

		System.out.println(" Alert Present     :  "+actAlert          +" Value Expected  :  "+expAlert);

		boolean actpdcPostDatedChequeChkbox                         = pdcPostDatedChequeChkbox.isSelected();
		boolean actpdcReseverseAccountpostingOnPDCConversionChkbox  = pdcReseverseAccountpostingOnPDCConversionChkbox.isSelected();
		boolean actpdcAutoCheckforMaturedChkbox                     = pdcAutoCheckforMaturedChkbox.isDisplayed();
		boolean actpdcDisplayinLedgerChkbox                         = pdcDisplayinLedgerChkbox.isDisplayed();
		boolean actpdcCheckDiscountingTxt                           = pdcCheckDiscountingTxt.isDisplayed();
		boolean actpdcChequeDiscountingVoucherType                  = pdcChequeDiscountingVoucherType.isDisplayed();

		boolean exppdcPostDatedChequeChkbox                         = true;
		boolean exppdcReseverseAccountpostingOnPDCConversionChkbox  = true;
		boolean exppdcAutoCheckforMaturedChkbox                     = true;
		boolean exppdcDisplayinLedgerChkbox                         = true;
		boolean exppdcCheckDiscountingTxt                           = true;
		boolean exppdcChequeDiscountingVoucherType                  = true;

		if (actpdcPostDatedChequeChkbox==exppdcPostDatedChequeChkbox && actpdcReseverseAccountpostingOnPDCConversionChkbox==exppdcReseverseAccountpostingOnPDCConversionChkbox &&
				actpdcAutoCheckforMaturedChkbox==exppdcAutoCheckforMaturedChkbox && actpdcDisplayinLedgerChkbox==exppdcDisplayinLedgerChkbox && actpdcCheckDiscountingTxt==exppdcCheckDiscountingTxt &&
				actpdcChequeDiscountingVoucherType==exppdcChequeDiscountingVoucherType && actValidationMessage.equalsIgnoreCase(expValidationMessage) && actAlert.equalsIgnoreCase(expAlert)) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settings_closeBtn));
			settings_closeBtn.click();
			return true;
		} 
		else
		{
			return false;
		}
	}


	//Cash And Bank Account Creation Pop Save Button
	@FindBy(xpath="(//*[@id='btnMasterSaveClick'])[2]")
	public static WebElement popSaveBtn;

	@FindBy (xpath="//a[@id='1104']//span[contains(text(),'Account')]")
	private static WebElement accountsMenu;


	@FindBy(xpath="//i[@class='icon-font6 icon-new']")
	public static WebElement masterNewBtn;


	@FindBy(xpath="//input[@id='sName']")
	public static WebElement accountNewNameTxt;

	//Code
	@FindBy(xpath="//input[@id='sCode']")
	public static WebElement codeTxt;

	//AccountType	
	@FindBy(xpath="//select[@id='iAccountType']")
	public static WebElement accountTypeDropdown;


	@FindBy(xpath="//*[@id='btnMasterSaveClick']")
	public static WebElement accountNewSaveBtn;


	@FindBy(xpath="//*[@id='id_header_4_table_body']/tr/td[2]")
	public static List<WebElement> accountBankList;


	@FindBy(xpath="//*[@id='id_header_4_table_data_body']/tr/td[1]")
	public static List<WebElement> accountBankListwithCreditLimit;



	public boolean checkCreationOfNewCashAndBankAccountType() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDRVAT));
		PDRVAT.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		checkUserFriendlyMessage();

		cashBankAccountTxt.click();
		cashBankAccountTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		cashBankAccountTxt.sendKeys(Keys.SPACE);
		cashBankAccountTxt.sendKeys("HDFC");
		Thread.sleep(2000);
		cashBankAccountTxt.sendKeys(Keys.TAB);

		Select accountType=new Select(accountTypeDropdown);
		accountType.selectByIndex(1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(popSaveBtn));
		popSaveBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashBankAccountTxt));
		cashBankAccountTxt.click();

		cashBankAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);

		cashBankAccountTxt.sendKeys(Keys.SPACE);

		int accountBankListCount=accountBankList.size();

		for (int i = 0; i < accountBankListCount; i++) 
		{
			String data=accountBankList.get(i).getText();

			if (data.equalsIgnoreCase("HDFC"))
			{
				accountBankList.get(i).click();
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));

		departmentTxt.sendKeys(Keys.SPACE);

		int departmentcount=departmentListCount.size();

		System.err.println(departmentcount);

		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();

			if(data.equalsIgnoreCase("INDIA"))
			{
				departmentListCount.get(i).click();

				break;
			}
		}

		departmentTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDRVATPlaceOfSupplyTXt));
		PDRVATPlaceOfSupplyTXt.click();
		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.END);
		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.SHIFT,Keys.HOME);
		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.SPACE);

		int placeOfSupplyListCount=placeOfSupplyList.size();

		for (int j = 0; j < placeOfSupplyListCount; j++) 
		{
			String data=placeOfSupplyList.get(j).getText();

			if (data.equalsIgnoreCase("Abu Dhabi"))
			{
				placeOfSupplyList.get(j).click();
			}
		}

		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.TAB);

		PDRVAT_JuridictionTxt.sendKeys(Keys.END);
		PDRVAT_JuridictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);

		PDRVAT_JuridictionTxt.sendKeys(Keys.SPACE);

		int jurdictionListCount=jurdictionList.size();

		for (int k = 0; k < jurdictionListCount; k++) 
		{
			String data=jurdictionList.get(k).getText();

			if (data.equalsIgnoreCase("Abu Dhabi"))
			{
				jurdictionList.get(k).click();
			}
		}
		
		PDRVAT_JuridictionTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDRVATChequeNoTxt));
		PDRVATChequeNoTxt.click();
		PDRVATChequeNoTxt.sendKeys("PDR2");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys(Keys.SPACE);

		int accountCount=accountListCount.size();

		System.err.println(accountCount);

		for(int i=0 ; i < accountCount ;i++)
		{
			String data=accountListCount.get(i).getText();

			if(data.equalsIgnoreCase("Customer A"))
			{
				accountListCount.get(i).click();

				break;
			}
		}

		enter_AccountTxt.sendKeys(Keys.TAB);

		enterTaxcode.click();
		enterTaxcode.sendKeys(Keys.SHIFT,Keys.HOME);
		enterTaxcode.sendKeys("STD");
		Thread.sleep(2000);

		enterTaxcode.sendKeys(Keys.TAB);

		enter_Amount.click();
		enter_Amount.clear();
		enter_Amount.sendKeys("6");
		enter_Amount.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
		String actPartyName = billRefPartyName.getText();
		String expPartyName = "Customer A (122-001)";

		System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		billRefNewReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		String actbillRefNewReferenceTxt=billRefNewReferenceTxt.getAttribute("value");
		String expbillRefNewReferenceTxt="6.00";

		System.err.println(" billRefNewReferenceTxt : "+actbillRefNewReferenceTxt +" Value Expected : "+expbillRefNewReferenceTxt);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

	/*	HashSet<String> actMessage = new HashSet<String>();

		for (int i = 0; i < 2; i++) 
		{
			String data = checkValidationMessage("");
			actMessage.add(data);
		}

		HashSet<String> expMessage = new HashSet<String>();

		expMessage.add("Voucher saved successfully : "+docno);
		expMessage.add("Saving in background.");

		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage);*/
		
		String expMessage1 = "Voucher saved successfully";

		String actMessage = checkValidationMessage(expMessage1);
		String expMessage2 = ": "+docno;

				
		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage1);

	//	if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) )

		if(actbillRefNewReferenceTxt.equalsIgnoreCase(expbillRefNewReferenceTxt) && 
				actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	


	public boolean checkSavingVoucherInPostDatedReceiptsWithCustomerC() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashBankAccountTxt));
		previousBtn.click();

		checkLoadingMessage();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copytoClipboardBtn));
		copytoClipboardBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nextBtn));
		nextBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		toggleBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pastefromClipboardBtn));
		pastefromClipboardBtn.click();

		checkUserFriendlyMessage();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
		String actPartyName = billRefPartyName.getText();
		String expPartyName = "Customer A (122-001)";

		System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		billRefNewReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		String actbillRefNewReferenceTxt=billRefNewReferenceTxt.getAttribute("value");
		String expbillRefNewReferenceTxt="6.00";

		System.err.println(" billRefNewReferenceTxt : "+actbillRefNewReferenceTxt +" Value Expected : "+expbillRefNewReferenceTxt);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		/*HashSet<String> actMessage = new HashSet<String>();

		for (int i = 0; i < 2; i++) 
		{
			String data = checkValidationMessage("");
			actMessage.add(data);
		}

		HashSet<String> expMessage = new HashSet<String>();

		expMessage.add("Voucher saved successfully : "+docno);
		expMessage.add("Saving in background.");

		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage);*/
		
		String expMessage1 = "Voucher saved successfully";

		String actMessage = checkValidationMessage(expMessage1);
		String expMessage2 = ": "+docno;

				
		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage1);

	//	if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) )

		if(actbillRefNewReferenceTxt.equalsIgnoreCase(expbillRefNewReferenceTxt) && 
				actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) )
		{
			return true;
		}
		else
		{
			return false;
		}
	}




	public boolean checkDeleteOptionInPDRVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));	
		previousBtn.click();

		checkLoadingMessage();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_DeleteBtn));
		new_DeleteBtn.click();

		getWaitForAlert();

		getAlert().accept();

		String expValidationMessage="Voucher deleted Successfully";

		String actValidationMessage=checkValidationMessage(expValidationMessage);

		if (actValidationMessage.equalsIgnoreCase(expValidationMessage)) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}




	@FindBy(xpath="//*[@id='90_0_AdvanceFilter_']/table/tbody/tr/td[1]/select")
	private static WebElement pdcFilterConjuctionDropdown;

	@FindBy(xpath="//tbody//input[@placeholder='Select Field']")
	private static WebElement pdcFilterStartdateField;

	@FindBy(xpath="//*[@id='90_0_AdvanceFilter_']/table/tbody/tr/td[3]/select")
	private static WebElement pdcFilterOperatorDropdown;

	@FindBy(xpath="//*[@id='90_0_AdvanceFilter_']/table/tbody/tr/td[4]/select")
	private static WebElement pdcFilterCompareWithDropdown;;

	@FindBy(xpath="//td[@id='mytable_col_1-5']")
	private static WebElement gridRow1SelectBankCol;

	@FindBy(xpath="//td[@id='mytable_col_3-5']")
	private static WebElement gridRow3SelectBankCol;

	@FindBy(xpath="//td[@id='mytable_col_4-5']")
	private static WebElement gridRow4SelectBankCol;

	@FindBy(xpath="//td[@id='mytable_col_2-5']")
	private static WebElement gridRow2SelectBankCol;

	@FindBy(xpath="//input[@id='mytableoptReversePosting']")
	private static WebElement gridEnterBank;

	@FindBy(xpath="//div[@id='filterTree_90_0_AdvanceFilter_']//a[@id='4']")
	private static WebElement pdcFilterStartDate;

	@FindBy(xpath="//div[@id='filterTree_90_0_AdvanceFilter_']//a[@id='1']")
	private static WebElement pdcFilterChequenumber;

	@FindBy(xpath="//div[@id='filterTree_90_0_AdvanceFilter_']//a[@id='2']")
	private static WebElement pdcFilterCustomer;

	@FindBy(xpath="//div[@id='filterTree_90_0_AdvanceFilter_']//a[@id='3']")
	private static WebElement pdcFilterBank;

	@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/ul[1]/a[1]")
	private static WebElement pdcFilterValueStartDate;

	/*@FindBy(xpath="//div[@id='filterTree_90_0_AdvanceFilter_']//a[@id='4']")
				private static WebElement pdcFilterValueStartDate;*/

	@FindBy(xpath="//div[@id='filterTree_90_0_AdvanceFilter_']//a[@id='1']")
	private static WebElement pdcFilterValueChequenumber;

	@FindBy(xpath="//div[@id='filterTree_90_0_AdvanceFilter_']//a[@id='2']")
	private static WebElement pdcFilterValueCustomer;

	@FindBy(xpath="//div[@id='filterTree_90_0_AdvanceFilter_']//a[@id='3']")
	private static WebElement pdcFilterValueBank;



	public boolean checkCovertingVoucherInPDCWithReversePosting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoPostingMenu));
		autoPostingMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCSMenu));
		convertMaturedPDCSMenu.click();

		int pdcDOClistCount=pdcDOClist.size();

		for (int i = 0; i < pdcDOClistCount; i++) 
		{

			String data=pdcDOClist.get(i).getText();
			if (data.equalsIgnoreCase("PDR VAT"))
			{
				pdcCheckBoxlist.get(i).click();
				
				pdcBanklist.get(i).click();

				gridEnterBank.click();

				gridEnterBank.sendKeys("Bank");
			}
		}

		gridEnterBank.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCsOkIcon));
		convertMaturedPDCsOkIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcGridRow1Chkbox));
		pdcGridRow1Chkbox.click();

		boolean getGridSelectRow1Chkbox=pdcGridRow1Chkbox.isSelected();

		String actRow1NumberBeforeConverting=pdcGridRow1Col3.getText();
		String expRow1NumberBeforeConverting="2";

		String actNameCol=pdcGridRow1Col5.getText();
		String expNameCol="HDFC";

		System.out.println("actNameCol   :"+actNameCol +" Value Expected  : "+expNameCol);

		String actBankNameCol=pdcGridRow1Col6.getText();
		String expBankNameCol="Bank";

		System.out.println("actBankNameCol   :"+actBankNameCol +" Value Expected  : "+expBankNameCol);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcVoucherOkIcon));
		pdcVoucherOkIcon.click();

		String expValidationMessage="Voucher Converted Successfully";

		String actValidationMessage=checkValidationMessage(expValidationMessage);

		System.out.println(" Validation Message   : "+actValidationMessage+"  Value Expected : "+expValidationMessage);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcVoucherFilterBtn));
		pdcVoucherFilterBtn.click();

		System.out.println("BeforeConvertingMaturityRow1Date----->" +actRow1NumberBeforeConverting     +"Value Expected :"+expRow1NumberBeforeConverting);


		if (getGridSelectRow1Chkbox==true && actValidationMessage.equalsIgnoreCase(expValidationMessage) &&
				actNameCol.equalsIgnoreCase(expNameCol) && actBankNameCol.equalsIgnoreCase(expBankNameCol))
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	@FindBy (xpath="//tbody[@id='tblBodyTransRender']/tr/td[5]")
	private static List<WebElement> grid_VoucherNoList;


	public boolean checkSavedCovertedVoucherInReceiptsAfterReversePosting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVoucher));
		receiptsVoucher.click();

		int count = grid_VoucherNoList.size();

		for (int i = 0; i < count; i++) 
		{
			String voucherNo = grid_VoucherNoList.get(i).getText();

			if (voucherNo.equalsIgnoreCase("2")) 
			{
				getAction().doubleClick(grid_VoucherNoList.get(i)).build().perform();
				break;
			}
		}

		checkValidationMessage("Voucher loaded Successfully");
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String actDocno             = documentNumberTxt.getAttribute("value");
		String actVouDate           = dateTxt.getAttribute("value");
		String actDepartment        = departmentTxt.getAttribute("value");
		String actChequeNo          = receipts_ChequeNoTxt.getAttribute("value");
		String actPDCNo             = voucherHeaderPDCNOTxt.getAttribute("value");
		String actAccount           = select1stRow_1stColumn.getText();
		String actAmount            = select1stRow_2ndColumn.getText();

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date=new Date();
		String expDate=df.format(date);
		System.out.println("expDate   :"+expDate);

		String expDocno              ="2";
		String expCurrency           ="INR";
		String expDepartment         ="INDIA";
		String expPDCNo              ="2";
		String expChequeNo           ="PDR2";
		String expAccount            ="HDFC";
		String expAmount             ="6.00";

		String actFooterAmt   =recepitsFooterAmt.getText();
		String expFooterAmt   ="6.00";


		System.out.println("Entry Page Document Number    "+actDocno       +"  value Expected  "+expDocno);
		System.out.println("Entry Page Voucher Date       "+actVouDate     +"  value Expected  "+expDate);
		System.out.println("Entry Page ChequeNoTxt        "+actChequeNo    +"  value Expected  "+expChequeNo);
		System.out.println("Entry Page Department         "+actDepartment  +"  value Expected  "+expDepartment);
		System.out.println("Entry Page Account            "+actAccount     +"  value Expected  "+expAccount);
		System.out.println("Entry Page Amount             "+actAmount      +"  value Expected  "+expAmount);
		System.out.println("Entry Page  PDC Number        "+actPDCNo       +"  value Expected  "+expPDCNo);
		System.out.println("Entry Page Footer  Amount     "+actFooterAmt   +"  Value Expected  "+expFooterAmt);


		if (actDocno.equalsIgnoreCase(expDocno) && actVouDate.equalsIgnoreCase(expDate) &&actDepartment.equalsIgnoreCase(expDepartment) && 
				actAccount.equalsIgnoreCase(expAccount) && actChequeNo.equalsIgnoreCase(expChequeNo) && 
				actAmount.equalsIgnoreCase(expAmount) && 
				actFooterAmt.equalsIgnoreCase(expFooterAmt) && actPDCNo.equalsIgnoreCase(expPDCNo))
		{
			return true;
		}
		else
		{
			return false;
		}
	}




	// To Do Reverse Posting  in Post Dated PAyments,here uncheck the Reverse Posting in  Recepits  

	@FindBy(xpath="//*[@id='txtSearchMenu_MainLayout']")
	private static WebElement serachMenuTextHomePage;

	@FindBy(xpath="//li/span")
	private static WebElement searchMenuTextClick;


	public boolean checkUpdateinPDCUnderSettingMenuForDisableEnableReversePostingInRecepits() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
		System.out.println("Setting buton is enabled");
		serachMenuTextHomePage.click();
		serachMenuTextHomePage.sendKeys("Configure Transactions");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
		searchMenuTextClick.click();	

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDCMenu));
		PDCMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcPostDatedChequeChkbox));
		pdcPostDatedChequeChkbox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
		updateBtn.click();

		getWaitForAlert();

		String actAlert = getAlert().getText();
		String expAlert= "Do you want to save the changes?";

		getAlert().accept();

		String expValidationMessage="Data saved Successfully";

		String actValidationMessage=checkValidationMessage(expValidationMessage);

		System.out.println(" Alert Present     :  "+actAlert          +" Value Expected  :  "+expAlert);

		if (actValidationMessage.equalsIgnoreCase(expValidationMessage) && actAlert.equalsIgnoreCase(expAlert)) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settings_closeBtn));
			settings_closeBtn.click();
			return true;
		} 
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settings_closeBtn));
			settings_closeBtn.click();
			return false;
		}
	}



	//PDP With PDC Vouchers






	@FindBy(xpath="//span[contains(text(),'PDP VAT')]")
	private static WebElement PDPVAT ;




	public boolean checkConvertMaturedPDCScreenForPDPVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoPostingMenu));
		autoPostingMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCSMenu));
		convertMaturedPDCSMenu.click();

		int pdcDOClistCount=pdcDOClist.size();

		for (int i = 0; i < pdcDOClistCount; i++) 
		{
			String data=pdcDOClist.get(i).getText();
			
			if (data.equalsIgnoreCase("PDP VAT"))
			{
				pdcCheckBoxlist.get(i).click();
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCsOkIcon));
		convertMaturedPDCsOkIcon.click();

		String expValidationMessage="No PDC's exists";

		String actValidationMessage=checkValidationMessage(expValidationMessage);

		System.out.println("Entry Page voucher  Validation Value Actual  : "+actValidationMessage+"  Value Expected : "+expValidationMessage);

		if( actValidationMessage.equalsIgnoreCase(expValidationMessage) )
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcVoucherCancelIcon));
			pdcVoucherCancelIcon.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcVoucherCancelIcon));
			pdcVoucherCancelIcon.click();
			return false;
		}
	}


	
	
	//PostDatedPayments

	public boolean CheckSavingVoucherInPDPVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDPVAT));
		PDPVAT.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		checkUserFriendlyMessage();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		newCashBankAccountTxt.click();

		newCashBankAccountTxt.sendKeys(Keys.SPACE);

		int cashAndBAnkAccountListCount  = cashAndBAnkAccountList.size();

		System.err.println("cashAndBAnkAccountListCount   : "+cashAndBAnkAccountListCount);

		for (int i = 0; i < cashAndBAnkAccountListCount; i++) 
		{
			String data	= cashAndBAnkAccountList.get(i).getText();

			if(data.equalsIgnoreCase("Bank"))
			{
				cashAndBAnkAccountList.get(i).click();

				break;
			}
		}

		newCashBankAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));

		departmentTxt.sendKeys(Keys.SPACE);

		int departmentcount=departmentListCount.size();

		System.err.println(departmentcount);

		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();

			if(data.equalsIgnoreCase("INDIA"))
			{
				departmentListCount.get(i).click();

				break;
			}
		}

		departmentTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDRVATPlaceOfSupplyTXt));
		PDRVATPlaceOfSupplyTXt.click();
		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.END);
		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.SHIFT,Keys.HOME);
		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.SPACE);

		int placeOfSupplyListCount=placeOfSupplyList.size();

		for (int j = 0; j < placeOfSupplyListCount; j++) 
		{
			String data=placeOfSupplyList.get(j).getText();

			if (data.equalsIgnoreCase("Abu Dhabi"))
			{
				placeOfSupplyList.get(j).click();
			}
		}

		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.TAB);

		PDRVAT_JuridictionTxt.sendKeys(Keys.END);
		PDRVAT_JuridictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);

		PDRVAT_JuridictionTxt.sendKeys(Keys.SPACE);

		int jurdictionListCount=jurdictionList.size();

		for (int k = 0; k < jurdictionListCount; k++) 
		{
			String data=jurdictionList.get(k).getText();

			if (data.equalsIgnoreCase("Abu Dhabi"))
			{
				jurdictionList.get(k).click();
			}
		}
		
		PDRVAT_JuridictionTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvpVATChequeTXT));
		pvpVATChequeTXT.click();
		pvpVATChequeTXT.sendKeys("PDPVAT1");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys(Keys.SPACE);

		int accountCount=accountListCount.size();

		System.err.println(accountCount);

		for(int i=0 ; i < accountCount ;i++)
		{
			String data=accountListCount.get(i).getText();

			if(data.equalsIgnoreCase("Customer a"))
			{
				accountListCount.get(i).click();

				break;
			}
		}

		enter_AccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enterPVPVATTaxcode));
		enterPVPVATTaxcode.click();
		enterPVPVATTaxcode.sendKeys(Keys.SHIFT,Keys.HOME);
		enterPVPVATTaxcode.sendKeys(Keys.BACK_SPACE);
		enterPVPVATTaxcode.sendKeys("std rate");

		/* int taxcodelistCount=PDPVATtaxcodelist.size();

			System.err.println(taxcodelistCount);

			for(int i=0 ; i < taxcodelistCount ;i++)
			{
				String data=PDPVATtaxcodelist.get(i).getText();

				if(data.equalsIgnoreCase("Std Rate"))
				{
					PDPVATtaxcodelist.get(i).click();


					break;
				}
			}*/
		
		Thread.sleep(2000);
		
		enterPVPVATTaxcode.sendKeys(Keys.TAB);

		enter_Amount.click();
		enter_Amount.clear();
		enter_Amount.sendKeys("6");
		enter_Amount.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
		String actPartyName = billRefPartyName.getText();
		String expPartyName = "Customer A (122-001)";

		System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);

		int Adjustbills=billRefAdjustBillsGrid.size();

		String actAdjustbills=Integer.toString(Adjustbills);

		String expAdjustbills="2";

		int billwiseAdjustBillsDocListcount=billwiseAdjustBillsDocList.size();

		HashSet<String> actbillwiseAdjustBillsDocList  = new HashSet<String>();

		for (int i = 0; i < billwiseAdjustBillsDocListcount; i++) 
		{
			String data	= billwiseAdjustBillsDocList.get(i).getText();

			if (data.equalsIgnoreCase("NDT46:2"))
			{
				billwiseAdjustBillsDocList.get(i).click();
			}
		}


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		/*HashSet<String> actMessage = new HashSet<String>();

		for (int i = 0; i < 2; i++) 
		{
			String data = checkValidationMessage("");
			actMessage.add(data);
		}

		HashSet<String> expMessage = new HashSet<String>();

		expMessage.add("Voucher saved successfully : "+docno);
		expMessage.add("Saving in background.");

		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage);*/

		
		String expMessage1 = "Voucher saved successfully";

		String actMessage = checkValidationMessage(expMessage1);
		String expMessage2 = ": "+docno;

				
		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage1);

	//	if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) )
		if(actAdjustbills.equalsIgnoreCase(expAdjustbills) && actPartyName.equalsIgnoreCase(expPartyName) 
				&& actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@FindBy(xpath="//input[@id='id_header_67108938']")
	private static WebElement pvpVATChequeTXT;

	@FindBy(xpath="//tbody[@id='id_header_10_table_body']/tr/td[2]")
	private static List<WebElement> currencyListCount;	  





	public boolean checkSavingNewVoucherInPDPVATOnFutureDateWithCurrencyAEDAndDepartmentINDIA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDPVAT));
		PDPVAT.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		documentNumberTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		/*//dateTxt.click();
		Thread.sleep(2000);
		//dateTxt.click();

		dateTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		//dateTxt.sendKeys(Keys.BACK_SPACE);
*/
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date=new Date();

		String docdate = df.format(date);  
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 21);  

		String FilterDate = df.format(c.getTime());  

		System.out.println("FilterDate  : "+FilterDate);

		dateTxt.sendKeys(FilterDate);
		Thread.sleep(2000);

		dateTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		newCashBankAccountTxt.click();

		newCashBankAccountTxt.sendKeys(Keys.SPACE);

		int cashAndBAnkAccountListCount  = cashAndBAnkAccountList.size();

		System.err.println("cashAndBAnkAccountListCount   : "+cashAndBAnkAccountListCount);

		for (int i = 0; i < cashAndBAnkAccountListCount; i++) 
		{
			String data	= cashAndBAnkAccountList.get(i).getText();

			if(data.equalsIgnoreCase("Bank"))
			{
				cashAndBAnkAccountList.get(i).click();

				break;
			}
		}

		newCashBankAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
		voucherHeaderCurrency.click();;
		voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);

		voucherHeaderCurrency.sendKeys(Keys.SPACE);

		int currencycount=currencyListCount.size();

		System.err.println(currencycount);

		for(int i=0 ; i < currencycount ;i++)
		{
			String data = currencyListCount.get(i).getText();

			if(data.equalsIgnoreCase("AED"))
			{
				currencyListCount.get(i).click();

				break;
			}
		}

		voucherHeaderCurrency.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));

		departmentTxt.sendKeys(Keys.SPACE);

		int departmentcount=departmentListCount.size();

		System.err.println(departmentcount);

		for(int i=0 ; i < departmentcount ;i++)
		{
			String data = departmentListCount.get(i).getText();

			if(data.equalsIgnoreCase("INDIA"))
			{
				departmentListCount.get(i).click();

				break;
			}
		}

		departmentTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDRVATPlaceOfSupplyTXt));
		PDRVATPlaceOfSupplyTXt.click();
		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.END);
		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.SHIFT,Keys.HOME);
		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.SPACE);

		int placeOfSupplyListCount=placeOfSupplyList.size();

		for (int j = 0; j < placeOfSupplyListCount; j++) 
		{
			String data=placeOfSupplyList.get(j).getText();

			if (data.equalsIgnoreCase("Abu Dhabi"))
			{
				placeOfSupplyList.get(j).click();
			}
		}

		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.TAB);

		PDRVAT_JuridictionTxt.sendKeys(Keys.END);
		PDRVAT_JuridictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);

		PDRVAT_JuridictionTxt.sendKeys(Keys.SPACE);

		int jurdictionListCount=jurdictionList.size();

		for (int k = 0; k < jurdictionListCount; k++) 
		{
			String data=jurdictionList.get(k).getText();

			if (data.equalsIgnoreCase("Abu Dhabi"))
			{
				jurdictionList.get(k).click();
			}
		}
		
		PDRVAT_JuridictionTxt.sendKeys(Keys.TAB);

		pvpVATChequeTXT.click();
		pvpVATChequeTXT.sendKeys("PDPVAT2");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys(Keys.SPACE);

		enter_AccountTxt.sendKeys("Cus");
		Thread.sleep(2000);

		int accountCount=accountListCount.size();

		System.err.println("accountCount  : "+accountCount);

		for(int i=0 ; i < accountCount ;i++)
		{
			String data=accountListCount.get(i).getText();

			if(data.equalsIgnoreCase("customer a"))
			{
				accountListCount.get(i).click();

				break;
			}
		}

		enter_AccountTxt.sendKeys(Keys.TAB);

		enterPVPVATTaxcode.click();
		enterPVPVATTaxcode.sendKeys(Keys.SHIFT,Keys.HOME);
		enterPVPVATTaxcode.sendKeys(Keys.SPACE);

		enterPVPVATTaxcode.sendKeys("STD RAte");
		Thread.sleep(2000);
		enterPVPVATTaxcode.sendKeys(Keys.TAB);

		enter_Amount.click();
		enter_Amount.clear();
		enter_Amount.sendKeys("10");
		enter_Amount.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
		String actPartyName = billRefPartyName.getText();
		String expPartyName = "Customer A (122-001)";

		System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);

		int Adjustbills=billRefAdjustBillsGrid.size();

		String actAdjustbills=Integer.toString(Adjustbills);

		String expAdjustbills="1";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		billRefNewReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		String expBillNewReference                      ="10.00";
		String expBillTransactionCurrency               ="10.00";
		String expBillBaseCurrency                      ="140.00";
		String expBillLocalCurrency                     ="10.00";
		String expBillBalanceNewRefAmount               ="10.00";

		String expbillRefAdjustAmountInTransCurency         ="10.00";
		String expbillRefBalanceAmountAdjustInTrnasCurrency ="0.00";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
		String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
		String actBillBaseCurrency                           = billRefBaseCurrency.getText();
		String actBillLocalCurrency                          = localCurrencyDhs.getText();
		String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
		String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
		String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridOrginalAmtRow1));
		String actgridOrginalAmtRow1     = gridOrginalAmtRow1.getText();
		String actgridBalanceAmtRow1     = gridBalanceAmtRow1.getText();
		String actgridAdjustmentAmtRow1  = gridAdjustmentAmtRow1.getText();


		String expgridOrginalAmtRow1      ="6.00";
		String expgridBalanceAmtRow1      ="6.00";
		String expgridAdjustmentAmtRow1   ="0.00";



		System.out.println("*********************************************************************************************************");

		System.out.println("Bill reference Adjustment Bills  :"+ actAdjustbills+"                          "+ "expDate :"+expAdjustbills);
		System.out.println("actBillNewReference :             "+ actBillNewReference +"                    "+ "expBillNewReference :"+expBillNewReference);
		System.out.println("actBillTransactionCurrency       :"+ actBillTransactionCurrency + "            " + "expBillTransactionCurrency :"+expBillTransactionCurrency);
		System.out.println("actBillBaseCurrency :             "+ actBillBaseCurrency + "                   " +"expBillBaseCurrency :"+expBillBaseCurrency);
		System.out.println("actBillLocalCurrency :            "+ actBillLocalCurrency+ "                   " +"expBillLocalCurrency :"+expBillLocalCurrency);
		System.out.println("actBillBalanceNewRefAmount :      "+ actBillBalanceNewRefAmount + "            " + "expBillBalanceNewRefAmount :"+expBillBalanceNewRefAmount);

		System.out.println("actbillRefAdjustAmountInTransCurency :"+ actbillRefAdjustAmountInTransCurency+ "       " +"expbillRefAdjustAmountInTransCurency :"+expbillRefAdjustAmountInTransCurency);
		System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrency :"+ actbillRefBalanceAmountAdjustInTrnasCurrency + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrency :"+expbillRefBalanceAmountAdjustInTrnasCurrency);

		System.out.println("actgridOrginalAmtRow1 :" +actgridOrginalAmtRow1 +"       " +"expgridOrginalAmtRow1 :" +expgridOrginalAmtRow1);


		System.out.println("actgridBalanceAmtRow1 :" +actgridBalanceAmtRow1 +"       " +"expgridBalanceAmtRow1 :" +expgridBalanceAmtRow1);


		System.out.println("actgridAdjustmentAmtRow1 :" +actgridAdjustmentAmtRow1 +"       " +"expgridAdjustmentAmtRow1:" +expgridAdjustmentAmtRow1);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

	/*	HashSet<String> actMessage = new HashSet<String>();

		for (int i = 0; i < 2; i++) 
		{
			String data = checkValidationMessage("");
			actMessage.add(data);
		}

		HashSet<String> expMessage = new HashSet<String>();

		expMessage.add("Voucher saved successfully : "+docno);
		expMessage.add("Saving in background.");

		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage);*/
		
		String expMessage1 = "Voucher saved successfully";

		String actMessage = checkValidationMessage(expMessage1);
		String expMessage2 = ": "+docno;

				
		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage1);

	//	if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) )

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) && actAdjustbills.equalsIgnoreCase(expAdjustbills) && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
				actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
				actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
				actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
				actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	



	public boolean checkSavedVoucherInPDPVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		previousBtn.click();

		checkLoadingMessage();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String actDocNo=documentNumberTxt.getAttribute("value");
		String expDocNo="2";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.click();

		String actDate=dateTxt.getAttribute("value");
		String expDate=maturityDateTxt.getAttribute("value");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashBankAccountTxt));
		cashBankAccountTxt.click();

		String actAccount=cashBankAccountTxt.getAttribute("value");
		String expAccount="Bank";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
		voucherHeaderCurrency.click();

		String actCurrency=voucherHeaderCurrency.getAttribute("value");
		String expCurrency="AED";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderExchangeRate));
		voucherHeaderExchangeRate.click();

		String actExchangeRate=voucherHeaderExchangeRate.getAttribute("value");
		String expExchangeRate="14.0000000000";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();

		String actdepartment=departmentTxt.getAttribute("value");
		String expdepartment="INDIA";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderLocalExchangeRate));
		voucherHeaderLocalExchangeRate.click();

		String actLocalExchangeRate=voucherHeaderLocalExchangeRate.getAttribute("value");
		String expLocalExchangeRate="1.0000000000";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		String actGridAccount=select1stRow_1stColumn.getText();
		String expGridAccount="Customer A";

		String actTaxCode=select1stRow_2ndColumn.getText();
		String expTaxCode="STD Rate";

		String actAmount=select1stRow_3rdColumn.getText();
		String expAmount="10.00";

		System.out.println("**************************************checkSavedVoucherInPDPVAT******************");

		System.out.println("DocNo              : "+actDocNo           +" Value Expected  : "+expDocNo);
		System.out.println("Date               : "+actDate            +" Value Expected  : "+expDate);
		System.out.println("Account            : "+actAccount         +" Value Expected  : "+expAccount);
		System.out.println("Currency           :"+actCurrency         +" Value Expected  : "+expCurrency);
		System.out.println("ExchangeRate       :"+actExchangeRate     +" Value Expected  : "+expExchangeRate);
		System.out.println("department         :"+actdepartment       +" Value Expected  : "+expdepartment);
		System.out.println("LocalExchangeRate  :"+actLocalExchangeRate+" Value Expected  :"+expLocalExchangeRate);
		System.out.println("TaxCode           :"+actTaxCode           +" Value Expected  : "+expTaxCode);
		System.out.println("GridAccount        :"+actGridAccount      +" Value Expected  : "+expGridAccount);
		System.out.println("Amount             :"+actAmount           +" Value Expected  : "+expAmount);

		if (actDocNo.equalsIgnoreCase(expDocNo) && actDate.equalsIgnoreCase(expDate) && actAccount.equalsIgnoreCase(expAccount) &&
				actCurrency.equalsIgnoreCase(expCurrency)&& actExchangeRate.equalsIgnoreCase(expExchangeRate)&& 
				actdepartment.equalsIgnoreCase(expdepartment) && actLocalExchangeRate.equalsIgnoreCase(expLocalExchangeRate) && 
				actTaxCode.equalsIgnoreCase(expTaxCode)&&
				actGridAccount.equalsIgnoreCase(expGridAccount) && actAmount.equalsIgnoreCase(expAmount) ) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	
	

	public boolean checkEditingVoucherAndSavingInPDPVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvpVATChequeTXT));
		pvpVATChequeTXT.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String actPDRVATChequeNoTxt=pvpVATChequeTXT.getAttribute("value");
		String expPDRVATChequeNoTxt="PDPVAT2";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_3rdColumn));
		select1stRow_3rdColumn.click();
		enter_Amount.sendKeys(Keys.CLEAR);
		enter_Amount.sendKeys("6");
		enter_Amount.sendKeys(Keys.TAB);

		String actAmount=select1stRow_3rdColumn.getText();
		String expAmount="6.00";

		System.out.println("***************************checkEditingVoucherAfterSavingInPDRVAT*************");

		System.out.println("PDRVATChequeNoTxt           :"+actPDRVATChequeNoTxt +" Value Expected  : "+expPDRVATChequeNoTxt);
		System.out.println("Amount                       :"+actAmount           +" Value Expected  : "+expAmount);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		billRefNewReferenceTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		/*HashSet<String> actMessage = new HashSet<String>();

		for (int i = 0; i < 2; i++) 
		{
			String data = checkValidationMessage("");
			actMessage.add(data);
		}

		HashSet<String> expMessage = new HashSet<String>();

		expMessage.add("Voucher saved successfully : "+docno);
		expMessage.add("Saving in background.");

		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage);*/
		
		
		String expMessage1 = "Voucher saved successfully";

		String actMessage = checkValidationMessage(expMessage1);
		String expMessage2 = ": "+docno;

				
		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage1);

	//	if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) )


		if (actAmount.equalsIgnoreCase(expAmount)  && actPDRVATChequeNoTxt.equalsIgnoreCase(expPDRVATChequeNoTxt) && 
				actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) ) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}





	public boolean checkDeleteOptionInPDPVAT() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));	
		previousBtn.click();

		boolean loading=checkLoadingMessage();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_DeleteBtn));
		new_DeleteBtn.click();

		getWaitForAlert();

		getAlert().accept();

		String expValidationMessage="Voucher deleted Successfully";

		String actValidationMessage=checkValidationMessage(expValidationMessage);

		if (actValidationMessage.equalsIgnoreCase(expValidationMessage)) 
		{
			System.out.println(" Test Pass: Converted Voucher Deletion Successfully ");	
			return true;
		}
		else
		{
			System.out.println(" Test Fail: Converted Voucher Deletion Successfully ");	
			return false;
		}
	}





	public boolean CheckSavedVoucherInPDPVATInCovertedPDCScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoPostingMenu));
		autoPostingMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCSMenu));
		convertMaturedPDCSMenu.click();

		int pdcDOClistCount=pdcDOClist.size();

		for (int i = 0; i < pdcDOClistCount; i++) 
		{
			String data=pdcDOClist.get(i).getText();
			
			if (data.equalsIgnoreCase("PDP VAT"))
			{
				pdcCheckBoxlist.get(i).click();

			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCsOkIcon));
		convertMaturedPDCsOkIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcGridRow1Chkbox));
		pdcGridRow1Chkbox.click();

		String actNumber=pdcGridRow1Col3.getText();
		String expNumber="1";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcGridRow1Col4));
		String actMaturityDate=pdcGridRow1Col4.getText();
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date date=new Date();
		String CurrentDate=df.format(date);
		String expMaturityDate=CurrentDate;

		System.out.println("CurrentDate      : "+CurrentDate);
		System.out.println("Maturity Date    : "+expMaturityDate);

		String actName=pdcGridRow1Col5.getText();
		String expName="Bank";

		String actAmount=pdcGridRow1Col7.getText();
		String expAmount="6.00";

		String actReassignedVouNo=pdcGridRow1Col8.getText();
		String expReassignedVouNo="1";

		System.out.println("******************CheckSavedVoucherInPDPVATInCovertedPDCScreen********************************");
		System.out.println(" Number         : "+actNumber           +" Value Expected  : "+expNumber);
		System.out.println("Name            : "+actName             +" Value Expected  : "+expName);
		System.out.println("Amount          : "+actAmount           +" Value Expected  : "+expAmount);
		System.out.println("ReassignedVouNo : " +actReassignedVouNo +" Value Expected  : "+expReassignedVouNo);

		if (actNumber.equalsIgnoreCase(expNumber) && actMaturityDate.equalsIgnoreCase(expMaturityDate)&&
				actName.equalsIgnoreCase(expName) &&actAmount.equalsIgnoreCase(expAmount) &&  actReassignedVouNo.equalsIgnoreCase(expReassignedVouNo))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}



	

	public boolean checkConvertingVouchersPDPInPDCVoucherScreenWithOutPostOnDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcVoucherOkIcon));
		pdcVoucherOkIcon.click();

		String expValidationMessage="Create PDCNo Field in Header Of Payments Voucher";
		String actValidationMessage=checkValidationMessage(expValidationMessage);

		if (actValidationMessage.equalsIgnoreCase(expValidationMessage))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}





	//Payments

	public boolean checkAddExtraFieldPDCInHeaderFieldOFPayments() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentsVoucher));
		paymentsVoucher.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsBtn));
		settingsBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTab));
		editLayoutTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutAddFieldsBtn));
		editLayoutAddFieldsBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutCaptionTxt));
		editLayoutCaptionTxt.click();
		editLayoutCaptionTxt.sendKeys("PDCNO");
		editLayoutCaptionTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutApplyBtn));
		editLayoutApplyBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
		errorMessageCloseBtn.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingUpdateIcon));
		settingUpdateIcon.click();

		for (int i = 0; i < 5; i++) 
		{
			if (getIsAlertPresent()==true) 
			{
				getAlert().accept();
			}
		}

		String expValidationMessage="Data saved successfully";

		String actValidationMessage=checkValidationMessage(expValidationMessage);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settings_closeBtn));
		settings_closeBtn.click();
		
		Thread.sleep(2000);

		if (actValidationMessage.equalsIgnoreCase(expValidationMessage) )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
	


	public boolean checkConvertingPDPVoucherInPDCScreenAfterExtraField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoPostingMenu));
		autoPostingMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCSMenu));
		convertMaturedPDCSMenu.click();

		int pdcDOClistCount=pdcDOClist.size();

		for (int i = 0; i < pdcDOClistCount; i++) 
		{
			String data=pdcDOClist.get(i).getText();
			
			if (data.equalsIgnoreCase("PDP VAT"))
			{
				pdcCheckBoxlist.get(i).click();
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCsOkIcon));
		convertMaturedPDCsOkIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcGridRow1Chkbox));
		pdcGridRow1Chkbox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcVoucherOkIcon));
		pdcVoucherOkIcon.click();

		String expValidationMessage="Voucher converted successfully";

		String actValidationMessage=checkValidationMessage(expValidationMessage);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcVoucherCancelIcon));
		pdcVoucherCancelIcon.click();

		if ( actValidationMessage.equalsIgnoreCase(expValidationMessage))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

	
	
	

	public boolean checkConvertedPDCVoucherInPayments() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentsVoucher));
		paymentsVoucher.click();

		int count = grid_VoucherNoList.size();

		for (int i = 0; i < count; i++) 
		{
			String voucherNo = grid_VoucherNoList.get(i).getText();

			if (voucherNo.equalsIgnoreCase("1")) 
			{
				getAction().doubleClick(grid_VoucherNoList.get(i)).build().perform();
				break;
			}
		}

		checkUserFriendlyMessage();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String actDocno             = documentNumberTxt.getAttribute("value");
		String actVouDate           = dateTxt.getAttribute("value");
		String actDepartment        = departmentTxt.getAttribute("value");
		String actChequeNo          = payments_ChequeNoTxt.getAttribute("value");
		String actAccount           = select1stRow_1stColumn.getText();
		String actAmount            = select1stRow_2ndColumn.getText();


		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date1=new Date();

		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 21);  
		String expDate = df.format(c.getTime());  

		String expDocno              ="1";
		String expDepartment         ="INDIA";
		String expPDCNo              ="1";

		String expChequeNo           ="PDPVAT1";
		String expAccount            ="Customer A";
		String expAmount             ="6.00";

		String actFooterAmt   =recepitsFooterAmt.getText();
		String expFooterAmt   ="6.00";

		System.out.println("Entry Page Document Number    "+actDocno       +"  value Expected  "+expDocno);
		System.out.println("Entry Page Voucher Date       "+actVouDate     +"  value Expected  "+expDate);
		System.out.println("Entry Page ChequeNoTxt        "+actChequeNo    +"  value Expected  "+expChequeNo);
		System.out.println("Entry Page Department         "+actDepartment  +"  value Expected  "+expDepartment);
		System.out.println("Entry Page Account            "+actAccount     +"  value Expected  "+expAccount);
		System.out.println("Entry Page Amount             "+actAmount      +"  value Expected  "+expAmount);
		System.out.println("Entry Page Footer  Amount     "+actFooterAmt   +"  Value Expected  "+expFooterAmt);

		if (actDocno.equalsIgnoreCase(expDocno) /*&& actVouDate.equalsIgnoreCase(expDate)*/ &&actDepartment.equalsIgnoreCase(expDepartment) && 
				actAccount.equalsIgnoreCase(expAccount) && actChequeNo.equalsIgnoreCase(expChequeNo)  && actAmount.equalsIgnoreCase(expAmount) && 
				actFooterAmt.equalsIgnoreCase(expFooterAmt))
		{
			return true;
		}
		else
		{
			return false;
		}
	}





	public boolean checkUpdateinPDCUnderSettingMenuForEnableReversePostingInPayments() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureTransactions));
		settingsConfigureTransactions.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDCMenu));
		PDCMenu.click();

		if (pdcPostDatedChequeChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcPostDatedChequeChkbox));
			pdcPostDatedChequeChkbox.click();
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcReseverseAccountpostingOnPDCConversionChkbox));
		pdcReseverseAccountpostingOnPDCConversionChkbox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
		updateBtn.click();

		getWaitForAlert();

		String actAlert = getAlert().getText();
		String expAlert= "Do you want to save the changes?";

		getAlert().accept();

		String expValidationMessage="Data saved Successfully";

		String actValidationMessage=checkValidationMessage(expValidationMessage);

		System.out.println("Alert Present     :  "+actAlert        +" Value Expected  :  "+expAlert);

		boolean actpdcPostDatedChequeChkbox                         = pdcPostDatedChequeChkbox.isSelected();
		boolean actpdcReseverseAccountpostingOnPDCConversionChkbox  = pdcReseverseAccountpostingOnPDCConversionChkbox.isSelected();
		boolean actpdcAutoCheckforMaturedChkbox                     = pdcAutoCheckforMaturedChkbox.isDisplayed();
		boolean actpdcDisplayinLedgerChkbox                         = pdcDisplayinLedgerChkbox.isDisplayed();
		boolean actpdcCheckDiscountingTxt                           = pdcCheckDiscountingTxt.isDisplayed();
		boolean actpdcChequeDiscountingVoucherType                  = pdcChequeDiscountingVoucherType.isDisplayed();

		boolean exppdcPostDatedChequeChkbox                         = true;
		boolean exppdcReseverseAccountpostingOnPDCConversionChkbox  = true;
		boolean exppdcAutoCheckforMaturedChkbox                     = true;
		boolean exppdcDisplayinLedgerChkbox                         = true;
		boolean exppdcCheckDiscountingTxt                           = true;
		boolean exppdcChequeDiscountingVoucherType                  = true;

		if (actpdcPostDatedChequeChkbox==exppdcPostDatedChequeChkbox && actpdcReseverseAccountpostingOnPDCConversionChkbox==exppdcReseverseAccountpostingOnPDCConversionChkbox &&
				actpdcAutoCheckforMaturedChkbox==exppdcAutoCheckforMaturedChkbox && actpdcDisplayinLedgerChkbox==exppdcDisplayinLedgerChkbox && actpdcCheckDiscountingTxt==exppdcCheckDiscountingTxt &&
				actpdcChequeDiscountingVoucherType==exppdcChequeDiscountingVoucherType && actValidationMessage.equalsIgnoreCase(expValidationMessage) && actAlert.equalsIgnoreCase(expAlert)) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settings_closeBtn));
			settings_closeBtn.click();
			return true;
		} 
		else
		{
			return false;
		}
	}




	public boolean checkSavingVoucherInPDPVATWithVendorB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDPVAT));
		PDPVAT.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		checkUserFriendlyMessage();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		newCashBankAccountTxt.click();

		newCashBankAccountTxt.sendKeys(Keys.SPACE);

		int cashAndBAnkAccountListCount  = cashAndBAnkAccountList.size();

		System.err.println("cashAndBAnkAccountListCount   : "+cashAndBAnkAccountListCount);

		for (int i = 0; i < cashAndBAnkAccountListCount; i++) 
		{
			String data	= cashAndBAnkAccountList.get(i).getText();

			if(data.equalsIgnoreCase("Bank"))
			{
				cashAndBAnkAccountList.get(i).click();

				break;
			}
		}

		newCashBankAccountTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));

		departmentTxt.sendKeys(Keys.SPACE);

		int departmentcount=departmentListCount.size();

		System.err.println(departmentcount);

		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();

			if(data.equalsIgnoreCase("INDIA"))
			{
				departmentListCount.get(i).click();

				break;
			}
		}

		departmentTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDRVATPlaceOfSupplyTXt));
		PDRVATPlaceOfSupplyTXt.click();
		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.END);
		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.SHIFT,Keys.HOME);
		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.SPACE);

		int placeOfSupplyListCount=placeOfSupplyList.size();

		for (int j = 0; j < placeOfSupplyListCount; j++) 
		{
			String data=placeOfSupplyList.get(j).getText();

			if (data.equalsIgnoreCase("Abu Dhabi"))
			{
				placeOfSupplyList.get(j).click();

			}
		}

		PDRVATPlaceOfSupplyTXt.sendKeys(Keys.TAB);

		PDRVAT_JuridictionTxt.sendKeys(Keys.END);
		PDRVAT_JuridictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);

		PDRVAT_JuridictionTxt.sendKeys(Keys.SPACE);

		int jurdictionListCount=jurdictionList.size();

		for (int k = 0; k < jurdictionListCount; k++) 
		{
			String data=jurdictionList.get(k).getText();

			if (data.equalsIgnoreCase("Abu Dhabi"))
			{
				jurdictionList.get(k).click();
			}
		}
		
		PDRVAT_JuridictionTxt.sendKeys(Keys.TAB);

		pvpVATChequeTXT.click();
		pvpVATChequeTXT.sendKeys("PDPVAT2");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys(Keys.SPACE);
		enter_AccountTxt.sendKeys("ven");
		
		Thread.sleep(2000);

		int accountCount=accountListCount.size();

		System.err.println(accountCount);

		for(int i=0 ; i < accountCount ;i++)
		{
			String data=accountListCount.get(i).getText();

			if(data.equalsIgnoreCase("Vendor b"))
			{
				accountListCount.get(i).click();

				break;
			}
		}

		enter_AccountTxt.sendKeys(Keys.TAB);

		enterPVPVATTaxcode.click();
		enterPVPVATTaxcode.sendKeys(Keys.SHIFT,Keys.HOME);
		enterPVPVATTaxcode.sendKeys(Keys.SPACE);
		enterPVPVATTaxcode.sendKeys("std rate");

		Thread.sleep(2000);
		
		enterPVPVATTaxcode.sendKeys(Keys.TAB);

		enter_Amount.click();
		enter_Amount.clear();
		enter_Amount.sendKeys("6");
		enter_Amount.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
		String actPartyName = billRefPartyName.getText();
		String expPartyName = "Vendor B (033-002)";

		System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);

		int Adjustbills=billRefAdjustBillsGrid.size();

		String actAdjustbills=Integer.toString(Adjustbills);

		String expAdjustbills="2";

		int billwiseAdjustBillsDocListcount=billwiseAdjustBillsDocList.size();

		HashSet<String> actbillwiseAdjustBillsDocList  = new HashSet<String>();

		for (int i = 0; i < billwiseAdjustBillsDocListcount; i++) 
		{
			String data		= billwiseAdjustBillsDocList.get(i).getText();

			if (data.equalsIgnoreCase("NDT57:SU/IND/TEXT4"))
			{
				billwiseAdjustBillsDocList.get(i).click();
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		String expBillNewReference                      ="0.00";
		String expBillTransactionCurrency               ="6";
		String expBillBaseCurrency                      ="6";
		String expBillLocalCurrency                     ="0.42";
		String expBillBalanceNewRefAmount               ="0.00";

		String expbillRefAdjustAmountInTransCurency         ="6.00";
		String expbillRefBalanceAmountAdjustInTrnasCurrency ="0.00";



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
		String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
		String actBillBaseCurrency                           = billRefBaseCurrency.getText();
		String actBillLocalCurrency                          = localCurrencyDhs.getText();
		String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
		String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
		String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();

		System.out.println("*********************************************************************************************************");

		System.out.println("Bill reference Adjustment Bills  :"+ actAdjustbills+"                          "+ "expBills :"+expAdjustbills);
		System.out.println("actBillNewReference :             "+ actBillNewReference +"                    "+ "expBillNewReference :"+expBillNewReference);
		System.out.println("actBillTransactionCurrency       :"+ actBillTransactionCurrency + "            " + "expBillTransactionCurrency :"+expBillTransactionCurrency);
		System.out.println("actBillBaseCurrency :             "+ actBillBaseCurrency + "                   " +"expBillBaseCurrency :"+expBillBaseCurrency);
		System.out.println("actBillLocalCurrency :            "+ actBillLocalCurrency+ "                   " +"expBillLocalCurrency :"+expBillLocalCurrency);
		System.out.println("actBillBalanceNewRefAmount :      "+ actBillBalanceNewRefAmount + "            " + "expBillBalanceNewRefAmount :"+expBillBalanceNewRefAmount);

		System.out.println("actbillRefAdjustAmountInTransCurency :"+ actbillRefAdjustAmountInTransCurency+ "       " +"expbillRefAdjustAmountInTransCurency :"+expbillRefAdjustAmountInTransCurency);
		System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrency :"+ actbillRefBalanceAmountAdjustInTrnasCurrency + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrency :"+expbillRefBalanceAmountAdjustInTrnasCurrency);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

	/*	HashSet<String> actMessage = new HashSet<String>();

		for (int i = 0; i < 2; i++) 
		{
			String data = checkValidationMessage("");
			actMessage.add(data);
		}

		HashSet<String> expMessage = new HashSet<String>();

		expMessage.add("Voucher saved successfully : "+docno);
		expMessage.add("Saving in background.");

		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage);*/
		
		String expMessage1 = "Voucher saved successfully";

		String actMessage = checkValidationMessage(expMessage1);
		String expMessage2 = ": "+docno;

				
		System.out.println("Actual Message    : "+actMessage);
		System.out.println("Expected Message  : "+expMessage1);

	//	if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) )

		if (actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2)  &&  actAdjustbills.equalsIgnoreCase(expAdjustbills)  && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
				actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
				actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
				actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
				actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency))
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	
	
	
	public boolean checkCovertingPDPVoucherInPDCWithReversePosting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoPostingMenu));
		autoPostingMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCSMenu));
		convertMaturedPDCSMenu.click();

		int pdcDOClistCount=pdcDOClist.size();

		for (int i = 0; i < pdcDOClistCount; i++) 
		{

			String data=pdcDOClist.get(i).getText();
			if (data.equalsIgnoreCase("PDP VAT"))
			{
				pdcCheckBoxlist.get(i).click();

			}
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCsOkIcon));
		convertMaturedPDCsOkIcon.click();

		String expValidationMessage="Select Bank";

		String actValidationMessage=checkValidationMessage(expValidationMessage);

		for (int i = 0; i < pdcDOClistCount; i++) 
		{
			String data=pdcDOClist.get(i).getText();
			
			if (data.equalsIgnoreCase("PDP VAT"))
			{
				pdcBanklist.get(i).click();

				gridEnterBank.click();

				gridEnterBank.sendKeys("HDFC");
				
				Thread.sleep(2000);
			}
		}

		gridEnterBank.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertMaturedPDCsOkIcon));
		convertMaturedPDCsOkIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcGridRow1Col3));
		String actRow1Number          = pdcGridRow1Col3.getText();
		String actMaturityRow1Date    = pdcGridRow1Col4.getText();
		String actRow1Name            = pdcGridRow1Col5.getText();
		String actRow1AppliedBank     = pdcGridRow1Col6.getText();
		String actRow1Amount          = pdcGridRow1Col7.getText();
		String actRow1ReassignedVouNo = pdcGridRow1Col8.getText();
		String actRow1ChequeNo        = pdcGridRow1Col9.getText();

		String expRow1Number           ="2";
		String expRow1Name             ="Bank";
		String expRow1Amount           ="6.00";
		String expRow1AppliedBank      ="HDFC";
		String expRow1ReassignedVouNo  ="2";
		String expRow1ChequeNo         ="PDPVAT2";

		System.out.println("Row1Number----------->" +actRow1Number           +"Value Expected :"+expRow1Number);
		System.out.println("Row1Name------------->" + actRow1Name            +"Value Expected :"+expRow1Name);
		System.out.println("Row1Amount----------->" +actRow1Amount           +"Value Expected :"+expRow1Amount);
		System.out.println("Row1ReassignedVouNo-->" + actRow1ReassignedVouNo +"Value Expected :"+expRow1ReassignedVouNo);
		System.out.println("Row1ChequeNo--------->" + actRow1ChequeNo        +"Value Expected :"+expRow1ChequeNo);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcGridRow1Chkbox));
		pdcGridRow1Chkbox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcVoucherOkIcon));
		pdcVoucherOkIcon.click();

		String expValidationMessage1="Voucher converted successfully";

		String actValidationMessage1=checkValidationMessage(expValidationMessage1);

		if ( actRow1Number.equalsIgnoreCase(expRow1Number)  && actRow1Name.equalsIgnoreCase(expRow1Name) &&
				actRow1Amount.equalsIgnoreCase(expRow1Amount) && actRow1ReassignedVouNo.equalsIgnoreCase(expRow1ReassignedVouNo) && 
				actRow1ChequeNo.equalsIgnoreCase(expRow1ChequeNo)  && actValidationMessage1.equalsIgnoreCase(expValidationMessage1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}





	public boolean checkSavedCovertedVoucherInPaymentsAfterReversePosting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentsVoucher));
		paymentsVoucher.click();

		int count = grid_VoucherNoList.size();

		for (int i = 0; i < count; i++) 
		{
			String voucherNo = grid_VoucherNoList.get(i).getText();

			if (voucherNo.equalsIgnoreCase("2")) 
			{
				getAction().doubleClick(grid_VoucherNoList.get(i)).build().perform();
				break;
			}
		}

		checkValidationMessage("Voucher Loading Message");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String actDocno             = documentNumberTxt.getAttribute("value");
		String actVouDate           = dateTxt.getAttribute("value");
		String actDepartment        = departmentTxt.getAttribute("value");
		String actChequeNo          = payments_ChequeNoTxt.getAttribute("value");
		String actAccount           = select1stRow_1stColumn.getText();
		String actAmount            = select1stRow_2ndColumn.getText();

		String expDocno              ="2";
		String expDepartment         ="INDIA";
		String expChequeNo           ="PDPVAT2";
		String expAccount            ="Bank";
		String expAmount             ="6.00";

		String actFooterAmt   =recepitsFooterAmt.getText();
		String expFooterAmt   ="6.00";

		System.out.println("Entry Page Document Number    "+actDocno       +"  value Expected  "+expDocno);
		System.out.println("Entry Page ChequeNoTxt        "+actChequeNo    +"  value Expected  "+expChequeNo);
		System.out.println("Entry Page Department         "+actDepartment  +"  value Expected  "+expDepartment);
		System.out.println("Entry Page Account            "+actAccount     +"  value Expected  "+expAccount);
		System.out.println("Entry Page Amount             "+actAmount      +"  value Expected  "+expAmount);
		System.out.println("Entry Page Footer  Amount     "+actFooterAmt   +"  Value Expected  "+expFooterAmt);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCloseBtn));
		homeCloseBtn.click();

		if (actDocno.equalsIgnoreCase(expDocno) &&actDepartment.equalsIgnoreCase(expDepartment) && 
				actAccount.equalsIgnoreCase(expAccount) && actChequeNo.equalsIgnoreCase(expChequeNo) && 
				actAmount.equalsIgnoreCase(expAmount) && 
				actFooterAmt.equalsIgnoreCase(expFooterAmt))
		{
			return true;
		}
		else
		{
			return false;
		}
	}








	public PDCPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}



}
