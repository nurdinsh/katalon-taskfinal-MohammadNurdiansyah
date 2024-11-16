# Final Project WEB Testing
Final Project for Automation Testing with Katalon Studio in TAK as Learning Partner

## Informasi Dasar
Website Testing (juice shop) adalah sebuah Final Project dari `Tes Aplikasi Kamu` dengan topik `Automation WEB Testing with Katalon`, Aplikasi berfokus pada bagimana cara kerja Website dengan melakukan testing pada semua fitur, yang dibuat oleh

Nama		                 : `Mohammad Nurdiansyah`\
Final Project Website    : [`Repository FP Website`](https://github.com/nurdinsh/katalon-taskfinal-MohammadNurdiansyah)\
Final Project Mobile     : [`Repository FP Mobile`](https://github.com/nurdinsh/katalon-taskmobile-MohammadNurdiansyah)\
Final Project API        : [`Repository FP API`](https://github.com/nurdinsh/katalon-taskapi-MohammadNurdiansyah)

---

# Panduan Penggunaan Aplikasi

## Requirement yang harus disipkan sebelum running aplikasi ini adalah :
- Menggunakan `Bahasa Groovy` based `Katalon Studio`
- Testing dilakukan pada Website [`Juice Shop`](https://juice-shop.herokuapp.com/)


## Ringkasan Hasil Testing
Pada pelaksanaan testing dilakukan testing pada `14 Test Case` dengan hasil :
```
13 Passed
1 Failed
0 Not Executed
```
Sehingga hasil pengujian adalah `94,12% Passed`

## IF Condition
Pada testing ini dimasukan test case yang berisi `IF CONDITION`, yaitu pada `Test Case Register` dan `Test Case Login`
```
Test Case register

if (Password_advice == 'true') {
    WebUI.click(findTestObject('Register/span_Show password advice'))
}
```


```
Test Case Login

if (Show_password == 'true') {
    WebUI.click(findTestObject('Login/mat-button-wrapper'), FailureHandling.STOP_ON_FAILURE)
}

if (Checked == 'true') {
    WebUI.check(findTestObject('Login/checkbox_Remember'), FailureHandling.STOP_ON_FAILURE)
}
```
## Switch Case Condition
Pada testing ini juga dimasukan satu test case yang berisi `Switch Case CONDITION`, yaitu pada `Test Case Register`
```
Test Case Register

def choiseQuestion = Question

switch (choiseQuestion) {
    case choiseQuestion = 'favorite book':
        println(choiseQuestion)

        WebUI.click(findTestObject('Register/span_Your favorite book'))

        break
    case choiseQuestion = 'favorite movie':
        println(choiseQuestion)

        WebUI.click(findTestObject('Register/span_Your favorite movie'))

        break
    case choiseQuestion = 'name pet':
        println(choiseQuestion)

        WebUI.click(findTestObject('Register/span_Name of your favorite pet'))}

switch (choiseQuestion) {
    case choiseQuestion = 'favorite book':
        println(choiseQuestion)

        WebUI.setText(findTestObject('Register/input_Security Answer'), Favorite_book)

        break
    case choiseQuestion = 'favorite movie':
        println(choiseQuestion)

        WebUI.setText(findTestObject('Register/input_Security Answer'), Favorite_movei)

        break
    case choiseQuestion = 'name pet':
        println(choiseQuestion)

        WebUI.setText(findTestObject('Register/input_Security Answer'), Name_pet)}
```
##  Behavior Driver Development
Pada testing ini dibuat juga test case dengan `Behavior Driver Development` yaitu pada `TC01_Register BDD` dengan `Gherkin Syntax with Cucumber`

```
Register.feature

@tag
Feature: Registration in the website Juice Shop
  I want to Registration to juice shop

  @tag1
  Scenario Outline: Resgistration Successfullly to the website Juice Shop
    Given The Juice Shop URL
    And 	I clik on the Menu Account
    Then The login menu butten will be displayed1 
    And 	I clik on the Register Link
    Then The Register menu will be displayed 
    When I input <Email>,<Password>,<Password_repeat>, and <Question> in the fields
    And I click on the register button
    Then The login menu butten will be displayed2 
    

    Examples: 
      | Email  | Password | Password_repeat | Question | 
      | Dian5@gmail.com  | Puc6xyeJOtC8SghT7Dz9yA== | Puc6xyeJOtC8SghT7Dz9yA==  | Dilan1991 |
      
```
```
Register.groovy

class Register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("The Juice Shop URL")
	def TheJuiceShopURL() {
		WebUI.callTestCase(findTestCase('Blocks/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I clik on the Menu Account")
	def IclikontheMenuAccount() {
		WebUI.callTestCase(findTestCase('Blocks/Menu Account'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("The Login menu butten will be displayed1")
	def TheLoginmenubuttenwillbedisplayed1() {
		WebUI.verifyElementVisible(findTestObject('Login/h1_Login'))
	}

	@And("I clik on the Register Link")
	def IclikontheRegisterLink() {
		WebUI.click(findTestObject('Object Repository/Register/a_Not yet a customer'))
	}

	@Then("The Register menu will be displayed")
	def TheRegistermenuwillbedisplayed() {
		WebUI.verifyElementVisible(findTestObject('Register/h1_User Registration'))
	}

	@When("I input (.*),(.*),(.*), and (.*) in the fields")
	def Iinputregis(String Email, Password, Password_repeat, Dilan1991 ) {

		WebUI.verifyElementVisible(findTestObject('Register/h1_User Registration'))

		WebUI.setText(findTestObject('Object Repository/Register/input_Register Email'), Email)

		WebUI.setEncryptedText(findTestObject('Register/input_Register Password'), Password)

		WebUI.setEncryptedText(findTestObject('Register/input_Repeat Password'), Password_repeat)

		if (Password_advice == 'true') {
			WebUI.click(findTestObject('Register/span_Show password advice'))
		}

		WebUI.click(findTestObject('Register/Span_Scurity question'))

		def choiseQuestion = Question

		switch (choiseQuestion) {
			case choiseQuestion = 'favorite book':
				println(choiseQuestion)

				WebUI.click(findTestObject('Register/span_Your favorite book'))

				break
			case choiseQuestion = 'favorite movie':
				println(choiseQuestion)

				WebUI.click(findTestObject('Register/span_Your favorite movie'))

				break
			case choiseQuestion = 'name pet':
				println(choiseQuestion)

				WebUI.click(findTestObject('Register/span_Name of your favorite pet'))
		}

		switch (choiseQuestion) {
			case choiseQuestion = 'favorite book':
				println(choiseQuestion)

				WebUI.setText(findTestObject('Register/input_Security Answer'), Favorite_book)

				break
			case choiseQuestion = 'favorite movie':
				println(choiseQuestion)

				WebUI.setText(findTestObject('Register/input_Security Answer'), Favorite_movei)

				break
			case choiseQuestion = 'name pet':
				println(choiseQuestion)

				WebUI.setText(findTestObject('Register/input_Security Answer'), Name_pet)
		}
	}



	@And("I click on the register button")
	def Iclickontheregisterbutton() {
		WebUI.click(findTestObject('Register/button_Register'))
	}

	@Then("The Login menu butten will be displayed2")
	def TheLoginmenubuttenwillbedisplayed2() {
		WebUI.verifyElementVisible(findTestObject('Login/h1_Login'), FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Blocks/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
```

## Data Driven Test
Pada testing ini dimasukan juga test case yang berisi `Data Driven Test` yaitu pada `Test Case Register`, `Test Case Login`, dan `Test Case All Function`\
Dokument DDT dapat diakses pada [`DDT Test File`](https://github.com/nurdinsh/katalon-taskfinal-MohammadNurdiansyah/tree/main/Data%20Files/RawData)\
Konsep DDT adalah memungkinkan untuk mengisi nilai dari vaiabel dari data yang bersumber pada Data File, tanpa harus di input manual satu-satu\
Data File dapat di generate dari sumber external seperti `DBMS` ataupun file seperti `.xls`, `.csv` pada kasus ini digunakan data dari File Excel `Valid Registration Data`,`Valid Login Data`,`Function data`.

Pada `TS01_Login` dipanggil `Valid Login Data`, `TS02_Register` dipanggil `Valid Registration Data`, dan `TS03_Function` dipanggil `Function data` lalu dilakukan `Data Binding`, untuk mengkoneksikan antara `Variabel` dalam Test Case dengan `Column` pada Data File. Sehingga pada pelaksanaan testing, column dalam Data File dapat di jalankan secara otomatis

## Report
Pada pengujian, jika harus satu-satu test case di test akan memakan waktu lama, sehingga dibuat `Test Suite` agar dapat menjalankan beberapa test case secara bersamaan yaitu
```
TS01_Login
TS02_Register
TS03_Function
```

[LinkedIn](https://www.linkedin.com/in/mohammad-nurdiansyah-099b31151/) | [GitHub](https://github.com/nurdinsh)
