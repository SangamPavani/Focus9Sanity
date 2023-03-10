package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.StockTransferVoucherPage;
import com.focus.Pages.StockTransferVoucherPage;
import com.focus.base.BaseEngine;

public class StockTransferVoucherTest extends BaseEngine
{
	StockTransferVoucherPage STV;

	@Test(priority=284)
	public void checkSavingStockTransferVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		STV=new StockTransferVoucherPage(getDriver());
		Assert.assertEquals(STV.checkSavingStockTransferVoucher(), true);
	}

	@Test(priority=285)
	public void checkSuspendOptionInSalesOrdersVoucherWithTransferedStock() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		STV=new StockTransferVoucherPage(getDriver());
		Assert.assertEquals(STV.checkSuspendOptionInSalesOrdersVoucherWithTransferedStock(), true);
	}

	@Test(priority=286) //
	public void checkSavingVoucherUsingCopyDocumentInStockTransfer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		STV=new StockTransferVoucherPage(getDriver());
		Assert.assertEquals(STV.checkSavingVoucherUsingCopyDocumentInStockTransfer(), true);
	}

	@Test(priority=287)
	public void checkUpdatingStockTransferVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		STV=new StockTransferVoucherPage(getDriver());
		Assert.assertEquals(STV.checkUpdatingStockTransferVoucher(), true);
	}

	@Test(priority=288)
	public void checkDeletingVoucherInStockTransfer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		STV=new StockTransferVoucherPage(getDriver());
		Assert.assertEquals(STV.checkDeletingVoucherInStockTransfer(), true);
	}

	@Test(priority=289)
	public void checkSavingAndSuspendingStockTransferVoucherFromHomepage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		STV=new StockTransferVoucherPage(getDriver());
		Assert.assertEquals(STV.checkSavingAndSuspendingStockTransferVoucherFromHomepage(), true);
	}
	
	@Test(priority=290)
	public void checkDeleteOptionInStockTransferFromHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		STV=new StockTransferVoucherPage(getDriver());
		Assert.assertEquals(STV.checkDeleteOptionInStockTransferFromHomePage(), true);
	}
	
	@Test(priority=291)
	public void checkVerifingDetailsOfSavedStockTransferVoucherInHomepage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		STV=new StockTransferVoucherPage(getDriver());
		Assert.assertEquals(STV.checkVerifingDetailsOfSavedStockTransferVoucherInHomepage(), true);
	}
	
	/*@Test(priority=292)
	public void checkLoginTOMaintainQuantityCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		STV=new StockTransferVoucherPage(getDriver());
		Assert.assertEquals(STV.checkLoginTOMaintainQuantityCompany(), true);
	}
	

	@Test(priority=293)
	public void checkCopyDocumentScreeninStockTransferVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		STV=new StockTransferVoucherPage(getDriver());
		Assert.assertEquals(STV.checkCopyDocumentScreeninStockTransferVoucher(), true);
	}
	
	
	
	@Test(priority=294)
	public void checkVoucherTypeinCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		STV=new StockTransferVoucherPage(getDriver());
		Assert.assertEquals(STV.checkVoucherTypeinCopyDocument(), true);
	}
	
		
	@Test(priority=295)
	public void checkSerachOptioninCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		STV=new StockTransferVoucherPage(getDriver());
		Assert.assertEquals(STV.checkSerachOptioninCopyDocument(), true);
	}
		
	
	
	@Test(priority=296)
	public void checkFilterOptioninCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		STV=new StockTransferVoucherPage(getDriver());
		Assert.assertEquals(STV.checkFilterOptioninCopyDocument(), true);
	}  
	
	
	@Test(priority=297)
	public void checkClubSimilarCheckBoxinCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		STV=new StockTransferVoucherPage(getDriver());
		Assert.assertEquals(STV.checkClubSimilarCheckBoxinCopyDocument(), true);
	}  
	
	
	
	@Test(priority=298)
	public void checkColumnValuesafterClubinStockTransferVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		STV=new StockTransferVoucherPage(getDriver());
		Assert.assertEquals(STV.checkColumnValuesafterClubinStockTransferVoucher(), true);
	}  
	
	*/
}
