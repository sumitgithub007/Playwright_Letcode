import { test,Page, expect } from '@playwright/test';



test.describe('Launch BrowserCovid', () => {
    test('Open browser Covid', async ({page}) => {
    
        await page.goto('https://www.covid19india.org/state/DL');

        let ele_found = false;
         let attempts_scroll = 10;
      
         while (!ele_found) {
           await page.evaluate(() => {
             window.scrollBy(0, 500);
           });
        
           const ele = await page.$("//div[contains(@class,'Up is-confirmed')]//*[name()='svg']//*[local-name()='circle']");
           await page.waitForTimeout(3000);

           if (ele) {
             ele_found = true;
           } else {
             attempts_scroll--;
           }
        }
        //    if (attempts_scroll === 0) {
        //      break;
        //    }
        // }
      
         let start_month: string ="";
        // const action = page.mouse;
      
        while (!start_month.includes('02 August')) {
          //  await page.pause();
            const statsText = await page.$eval('div.stats.is-confirmed', (div) => div.textContent);
          console.log(statsText);
          console.log('-----------------------------');
         
          const element = await page.$("//div[contains(@class,'Up is-confirmed')]//*[name()='svg']//*[local-name()='circle']"
          );
      
          let srcBound= await element?.boundingBox();
          if(srcBound){
          await page.mouse.move(srcBound.x+srcBound.width/2,srcBound.y+srcBound.height/2);
        await page.mouse.down();
        await page.mouse.move(srcBound.x -1,srcBound.y+srcBound.height/2);
        await page.mouse.up();
        //await element?.hover({ position: { x: -5, y:0.0} });
          //await page.waitForTimeout(1000);
          }
          start_month = await page.locator("div.stats.is-confirmed h5:nth-child(2)").textContent()|| '';
          start_month = start_month ;
       
         
        }
      




        })

})
  
 
  
