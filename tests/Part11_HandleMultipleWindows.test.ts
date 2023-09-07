import { test,BrowserContext,Browser,Page, expect } from '@playwright/test';

let page: Page;
let browser: Browser;
let context: BrowserContext;
test.beforeAll(async ({ browser }) => {
    
     context = await browser.newContext();
     page =await context.newPage();
     await page.goto("https://www.letcode.in/windows");
});

 

test.describe('Launch Browser and Handle multiple windows', () => {
  
    test('Open browser to handle multiple windows', async () => {
     
    await page.click("#home")
    
   const [newWindow] = await Promise.all([
       await   context.waitForEvent("page"),
       await page.click("#home")
   ])
  await newWindow.waitForLoadState();
   
    // expect(newWindow.url()).toContain("test"); {not wait for 5000 ms }
     await expect(newWindow).toHaveURL("https://letcode.in/test"); //it will wait here
 
    
  });
 
  test('Amazon handle windows', async () => {
     
    await page.goto("https://www.amazon.com");
      console.log("helloooo"); 
   });  

  
});

 
 