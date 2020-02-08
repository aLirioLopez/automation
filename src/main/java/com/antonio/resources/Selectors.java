package com.antonio.resources;

public class Selectors {

    //URLS
    //public static String WOMENURL = "http://automationpractice.com/index.php?id_category=3&controller=category";
    public static String HOMEURL = "http://automationpractice.com/index.php";
    public static String PRODUCT1URL = "http://automationpractice.com/index.php?id_product=1&controller=product";
    public static String ORDERURL = "http://automationpractice.com/index.php?controller=order";
    public static String SIGINURL = "http://automationpractice.com/index.php?controller=authentication&multi-shipping=0&" +
            "display_guest_checkout=0&back=http%3A%2F%2Fautomationpractice.com%2Findex.php%3Fcontroller%3Dorder%26step%3D1%26multi-shipping%3D0";
    public static String ADDRESSESURL = "http://automationpractice.com/index.php?controller=order&step=1";
    public static String SHIPPINGURL = "http://automationpractice.com/index.php?controller=order";
    public static String PAYMENTURL = "http://automationpractice.com/index.php?controller=order&multi-shipping=";

    //HOME PAGE
    public static String WOMENBUTTON = ".sf-menu > li:nth-child(1) > a:nth-child(1)";
    //public static String DRESSESBUTTON = ".sf-menu > li:nth-child(2) > a:nth-child(1)";
    //public static String SHIRTSBUTTON = ".sf-menu > li:nth-child(3) > a:nth-child(1)";
    public static String CARTBUTTON = ".shopping_cart > a:nth-child(1)";
    public static String NOPRODUCTSCART = ".ajax_cart_no_product";
    public static String HOMEPRODUCTBLOCK = "#homefeatured > li:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h5:nth-child(1) > a:nth-child(1)";
    public static String EMPTYPRODUCTCOUNTER = ".ajax_cart_no_product";

    //WOMEN PAGE
    public static String PRODUCTBLOCK = "li.ajax_block_product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h5:nth-child(1) > a:nth-child(1)";

    //PRODUCT PAGE
    //public static String MINUSBUTTON = "a.btn:nth-child(3)";
    //public static String PLUSBUTTON = "a.btn:nth-child(4)";
    public static String ADDTOCART = "button.exclusive";
    public static String ADDEDMODAL = "#layer_cart > div:nth-child(1)";
    public static String MODALPROCEEDBUTTON = "a.btn:nth-child(2)";
    public static String PRODUCTQUANTITYFIELD = "#quantity_wanted";
    public static String NULLQUANTITYMODAL = ".fancybox-error";
    public static String PRODUCTSIZECOMBO = "#group_1";
    public static String PRODUCT1ORANGE = "#color_13";
    public static String PRODUCT1BLUE = "#color_14";

    //ORDER PAGE
    public static String PRODUCTMINUSBUTTON = ".icon-minus";
    public static String PRODUCTPLUSBUTTON = ".icon-plus";
    public static String PRODUCTDELETEBUTTON = ".icon-trash";
    public static String ORDERCONTINUEBUTTON = ".button-exclusive";
    public static String ORDERPROCEEDBUTTON = ".standard-checkout";
    public static String PRODUCTQUANTITY = ".cart_quantity_input";
    public static String ORDERPRODUCTCOUNTER = ".heading-counter";
    public static String ORDERPAGESTEP = ".step_current > span:nth-child(1) > em:nth-child(1)";
    public static String ORDERPAGEEMTPY = ".alert";
    /*STEPS
    * 01. SUMMARY
    * 02. SIGN IN
    * 03. ADDRESS
    * 04. SHIPPING
    * 05. PAYMENT
    * */

    //SIGN IN PAGE
    public static String SIGNUPEMAILFIELD = "#email_create";
    public static String CREATEACCOUNTBUTTON = "#SubmitCreate";
    public static String SIGNINEMAILFIELD = "#email";
    public static String SIGNINPWDFIELD = "#passwd";
    //public static String FORGOTPWDFIELD = ".lost_password > a:nth-child(1)";
    public static String SIGNINBUTTON = "#SubmitLogin";
    public static String SIGNINPAGESTEP = ".step_current > span:nth-child(1) > em:nth-child(1)";

    // CREATE USER FORM PAGE
    public static String SELECTGENDERRADIO = "#id_gender1";
    public static String FIRSTNAMEFIELD = "#customer_firstname";
    public static String LASTNAMEFIELD = "#customer_lastname";
    //public static String EMAILFIELD = "#email";
    public static String PASSWORDFIELD = "#passwd";
    public static String DAYOFBIRTHCOMBO = "#days";
    public static String MONTHOFBIRTHCOMBO = "#months";
    public static String YEAROFBIRTHCOMBO = "#years";
    public static String NEWSLETTERCHECK = "#newsletter";
    public static String SPECIALOFFERSCHECK = "#optin";

    public static String REGISTERBUTTON = "#submitAccount";

    public static String ADDRESSFIRSTNAMEFIELD = "#firstname";
    public static String ADDRESSLASTNAMEFIELD = "#lastname";
    public static String COMPANYFIELD = "#company";
    public static String ADDRESSFIELD = "#address1";
    public static String ADDRESS2FIELD = "#address2";
    public static String CITYFIELD = "#city";
    public static String STATECOMBO = "#id_state";
    public static String POSTALCODEFIELD = "#postcode";
    public static String COUNTRYCOMBO = "#id_country";
    public static String ADDITIONALINFOBOX = "#other";
    public static String HOMEPHONEFIELD = "#phone";
    public static String MOBILEPHONEFIELD = "#phone_mobile";
    public static String ADDRESSALIASFIELD = "#alias";

    //ADDRESS PAGE
    //public static String CHOSEADDRESSCOMBO = "#uniform-id_address_delivery";
    //public static String DELIVERYSHIPPINGCHECK = "#addressesAreEquals";
    public static String UPDATEDELIVERYBUTTON = "#address_delivery > li.address_update > a";
    //public static String UPDATESHIPPINGBUTTON = "#address_invoice > li.address_update > a";
    //public static String ADDNEWADDRESSBUTTON1 = "#address_invoice_form > a:nth-child(1)";
    public static String ADDNEWADDRESSBUTTON2 = ".address_add > a:nth-child(1)";
    //public static String ORDERCOMMENTBOX = "textarea.form-control";
    public static String ADDRESSSTEP = ".step_current > span:nth-child(1) > em:nth-child(1)";
    //public static String ADDRESSCONTINUEBUTTON = ".button-exclusive";
    public static String ADDRESSPROCEEDBUTTON = "button.button:nth-child(4)";

    //CREATE UPDATE ADDRESS PAGE
    public static String SUBMITADDRESSBUTTON = "#submitAddress";
    //public static String BACKTOADDRESSESBUTTON = ".btn-defaul";

    //SHIPPING PAGE
    public static String TERMSOFSERVICECHECK = "#cgv";
    //public static String READTERMSOFSERVICELINK = ".iframe";
    //public static String TERMSOFSERVICEMODAL = ".fancybox-inner"; //Displayed?
    //public static String CLOSETERMSMODAL = "/html/body/div[2]/div/div/a"; //Displayed?
    //public static String AGREETERMSMODAL = ".fancybox-error"; //Displayed?
    //public static String CLOSEAGREEMODAL = "/html/body/div[2]/div/div/a"; //Displayed?
    //public static String SHIPPINGCONTINUEBUTTON = ".button-exclusive";
    public static String SHIPPINGPROCEEDBUTTON = "button.button:nth-child(4)";
    public static String SHIPPINGPAGESTEP = ".step_current > span:nth-child(1) > em:nth-child(1)";

    //PAYMENT PAGE
    public static String PAYBYBANKBUTTON = ".bankwire";
    public static String PAYBYCHECKBUTTON = ".cheque";
    //public static String PAYCONTINUEBUTTON = ".button-exclusive";
    public static String PAYMENTPAGESTEP = "#step_end > span:nth-child(1) > em:nth-child(1)";

    //BANKCONFIRMORDERPAGE
    //public static String OTHERMETHODSBUTTON = ".button-exclusive";
    public static String CONFIRMORDERBUTTON = "button.button-medium";

    //ORDER CONFIRMATION PAGE
    public static String SUCCESSALERT = ".box";
    //public static String BACKTOORDERSBUTTON = ".button-exclusive";

}
