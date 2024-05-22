import { chromium, Page } from 'playwright';
async function isElementVisibleInViewport(page: Page, selector: string): Promise<boolean> {
return await page.evaluate((selector) => {
const element = document.querySelector(selector);
if (!element) {
return false;
}
const rect = element.getBoundingClientRect();
return (
rect.top >= 0 &&
rect.left >= 0 &&
rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) &&
rect.right <= (window.innerWidth || document.documentElement.clientWidth)
);
}, selector);
}
(async () => {
const browser = await chromium.launch();
const page = await browser.newPage();
await page.goto('http://your-website-url.com');
// Use the function to check if the element is visible in the viewport
const isVisible = await isElementVisibleInViewport(page, 'your-element-selector');
console.log(Element is ${isVisible ? 'visible' : 'not visible'} in the viewport);
await browser.close();
})();
async function isElementVisibleInViewport(page: Page, xpath: string): Promise<boolean> {
const elements = await page.$x(xpath);
if (elements.length === 0) {
return false;
}
const element = elements[0];
return await page.evaluate((el) => {
const rect = el.getBoundingClientRect();
return (
rect.top >= 0 &&
rect.left >= 0 &&
rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) &&
rect.right <= (window.innerWidth || document.documentElement.clientWidth)
);
}, element);
}
(async () => {
const browser = await chromium.launch();
const page = await browser.newPage();
await page.goto('http://your-website-url.com');
// Use the function to check if the element is visible in the viewport
const xpath = 'your-xpath-selector';
const isVisible = await isElementVisibleInViewport(page, xpath);
console.log(Element is ${isVisible ? 'visible' : 'not visible'} in the viewport);
await browser.close();
})();