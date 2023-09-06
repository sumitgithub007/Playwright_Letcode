import { test,Page, expect } from '@playwright/test';

let page: Page;
test.beforeAll(async ({ browser }) => {
    
     page = await browser.newPage();
    // await page.goto("https://www.letcode.in/edit/");
});
test.describe('Launch Browser and Handle Inputs', () => {

  

  test('Handling Different Inputs', async () => {
     
   await page.goto("https://www.amazon.in/"); 
   await page.locator("#twotabsearchtextbox").type("mobile");
   console.log("xxxxxxxxxxxxxxxxxxxxx"+await page.locator("#twotabsearchtextbox").inputValue() );
   

//    //await page.fill("id=fullName","Sumit Goyal");
//     await page.locator("id=fullNajhgfdme").inputValue();
//   //name?.type("sumit goel");
//  //  await page.pause();
//    //  await  page.locator("#funnName").type("sumit");  // idhar wait karta rahega
      
//      const name =   await page.$("id=fullName"); //isi line par resolve kardeta hai ya to null dega ya element
//      //console.log("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
     
//     await name?.type("sumit goel");
   //  await page.pause();#join
  });

  test('Append the text at end', async () => {
     
  //  const textBox =await page.$("#join");
   
  // await  textBox?.type("sumit ");  //It will append the text at beginning , not clear textBox
   //await  textBox?.fill("sumit ");  //clear the text first then it will fill
  
    // await textBox?.click();
    // await textBox?.press('Shift'); 
 
     //await textBox?.type("baint",);
  //await textBox?.fill("s");
  //await page.keyboard.up("Shift");

});

   
  
});

 
 