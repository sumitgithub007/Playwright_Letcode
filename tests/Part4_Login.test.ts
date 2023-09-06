import { test,Page, expect } from '@playwright/test';

 
 

test.describe('Launch Browser and Fill Login Form', () => {
  test('Open browser Signup', async ({page}) => {
     
   await page.goto("https://www.letcode.in"); 
    await page.locator("[class='button is-primary is-rounded is-small']").first().click();
   
   await page.locator("#name").type("sumit goyal");
   await page.locator("#email").type("goyalsumit319@gmail.com");
    await page.locator("[name='password']").type("Subh@198788#!");
    let va = await page.locator("[name='password']").inputValue();
    console.log("valus is = "+va);
   await page.click('button:text("LOGIN")');
    await page.pause();

    
  });

  test.only('Open browser Login the website of kaushik', async ({page}) => {
     
    await page.goto("https://www.letcode.in"); 
     await page.locator("a[href='/signin']").click();
    
  
    await page.locator("[placeholder='Enter registered email']").first().type("goyalsumit319@gmail.com");
   await page.locator("[placeholder='Enter password']").type("Subh@1987#!");
   await page.click('button:text("LOGIN")');
   
   //await expect(page.locator("[aria-label='Welcome sumit']")).toHaveCount(0);
   await page.click("//*[text()='Sign out']");
   //await page.pause();
 
     
   });  

  
});

 
 