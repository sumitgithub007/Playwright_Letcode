import { test,Page, expect } from '@playwright/test';
 
 

test.describe('Launch Browser and Upload the file', () => {

  const filePath1 = "../LearnPlaywright/tests/uploads/vid1.mp4"
  const filePath2 = ".c/tests/uploads/vid2.mp4"

  test('Open browser for uploading file', async ({page}) => {
     
   await page.goto("https://www.sendgb.com/"); 
    await page.locator("button[class='close']").last().click();
    await page.locator("span[class='btn btn-xl cookiebutton waves-effect waves-light']").click();
    await page.setInputFiles("input[name='qqfile']", [filePath1,filePath2] );
    await page.pause();

  });

  

   
  
});

 
 