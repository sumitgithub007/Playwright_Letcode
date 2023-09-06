import { test,Page, expect } from '@playwright/test';

let page: Page;
test.beforeAll(async ({ browser }) => {
    
     page = await browser.newPage();
     await page.goto("https://www.letcode.in/");
});

 

test.describe('Launch Browser', () => {
  test('Open browser', async () => {
      console.log(await page.title());
    await page.locator("[class='button is-primary is-rounded is-small']").first().click();
    await page.pause();

       // 
  });  


  
});

 
 