import { test,Page, expect } from '@playwright/test';

 
test.describe('Handling Select Dropdowns', () => {
  test('Open browser and handle Select dropdowns', async ({page}) => {
     
   await page.goto("https://www.letcode.in/dropdowns"); 
    
    const ele = await page.$("#prompt");
    
   const fruit =  await page.$("#fruits");
   await fruit?.selectOption("4");  // 4 is value="4" in HTML DOM
   const msg =await page.$("div.notification.is-success");
   if(msg)
   {
   
    //no await before expect so promise of msg.textContent() will be resolved immediately
    expect(await msg.textContent()).toContain("Pine Apple");
   
   } //this will wait for 10 seconds because await is  before expect  
   //await expect(page.locator("div.notification.is-success")).toHaveText("Youkr name is: hello this is sumit how are you");
 
   const heroes = await page.$("#superheros");
   console.log(await heroes?.innerText());
   await heroes?.selectOption([

    {label:"Doctor Strange"},{value:"cm"},{index:8}
   ])
   
   //size check using $$
    const size =   (await page.$$("#lang")).length;
     console.log(size);

  //Fetch the selected Text
  const dropdownText= await page.$eval<string,HTMLSelectElement>("#country",ele=>ele.value);
  console.log(dropdownText);

   await page.waitForTimeout(10000);
   
  

  });

  

  
});

 
 