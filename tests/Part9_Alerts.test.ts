import { test,Page, expect } from '@playwright/test';

 
test.describe('Handling Alerts', () => {
  test('Open browser and handle alert', async ({page}) => {
     
   await page.goto("https://www.letcode.in/alert"); 
    
    const ele = await page.$("#prompt");
   //This will be written first 
    page.on("dialog",(dialog)=>{  
        console.log("dialog message"+dialog.message());
        console.log("Default value"+dialog.defaultValue());
        console.log("Type of alerts= "+dialog.type());
        dialog.accept("hello this is sumit how are you");
    })
    await ele?.click();
    await expect(page.locator("#myName")).toHaveText("Youkr name is: hello this is sumit how are you");
    await page.waitForTimeout(3000);
  });

  

  
});

 
 