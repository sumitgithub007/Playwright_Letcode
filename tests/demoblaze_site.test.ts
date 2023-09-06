import { test,Page, expect } from '@playwright/test';

let page: Page;
test.beforeAll(async ({ browser }) => {
    
     page = await browser.newPage();
     await page.goto("https://www.demoblaze.com/");
});

 

test.describe('Demoblaze check website', () => {
  test('Open browser demoblaze url', async () => {
      console.log(await page.title());
  
    
  });

  test('sample Test', async () => {

   await page.locator("#login2").click();
   await page.locator("#loginusername").fill("goyalsumit678@gmail.com");

    await page.pause();
  });

  
});

 
 