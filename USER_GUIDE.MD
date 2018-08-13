# USERS GUIDE
  _________________
  
  
  Opening the Web Api GLYCE & LIFE at http://localhost:8090/ 
  
  ![Website Index](/guide_src/starting_page.JPG)
  
  In this main page, you can learn many thing about FOODS with more than 1000 elements stored in database.
  Use scrolling to view all the food items. No pagination available in first version of API.    
  Default index page is the ALIMENTS choice.

  ### Header menu
  
  The header menu contain two large buttons named ALIMENTS and RECETTES to navigate at food page also recipe page.    
  
  ![Header Menu](/guide_src/head_menu_buttons.JPG)
  
  ### ALIMENTS...
  
    *1. FOOD FOCUSES*
  
  Just under the header, 3 blocs to focus and calculate each clicked food. Default value to calculate the Glycemic Charge is 100 grams.
  It is possible to update values and result dynamically changes.
  
  ![FOOD/CALCULATING FOCUS](/guide_src/aliment_cg_calculate.JPG)
  
      *2. FOOD ITEM LIST - Ordering column*
      
  Below the calculator, header of food listing permit to ordering ascendant/desc by clicking on each green column title.    
  The ordered list showed by a green arrow.
  
  ![FOOD LIST/ORDERING](/guide_src/aliment_ordering_option.JPG)
  
      *3. FOOD ITEM - Deployment food properties*
      
  At left of Foods, a single up arrow allow user to see the details of food properties like sugar, lipid, protein...    
  
  ![FOOD ITEM/PROPERTIES](/guide_src/aliment_properties.JPG)
  
  
 ### RECETTES...
  
    *1. RECETTE - Main page*
    
  This recipe main page separated in two parts.    
  At left, a listing of stored recipes.    
  ![RECIPE LIST](/guide_src/recipe_listing.JPG)    
  At right, the content of selected recipe. By default, the first recipe is showed.    
  ![RECIPE DETAIL](/guide_src/recipe_details.JPG)    
  
    *2. RECETTE - recipe actions view or delete*
    
  To view details of a recipe, click on choosen recipe name, content of detail part will automatically update with recipe infos.    
  To delete a recipe, click on trash right, all datas concerned by the selected recipe wil be erased.
   ![RECIPE ACTIONS](/guide_src/recipe_delete_button.JPG)
   
    *3. RECETTE - Create new*
    
  The first recipe list item 'creer' permit to create a new recipe clicking icon.    
  This action open a new main form with empty inputs.
  To store a new recipe, you must enter a valid name for your recipe, and it must contain at least one portion of valid aliment.    
  ![RECIPE FORM](/guide_src/recipe_creation_page.JPG)    
  
  Start writting name clicking in recipe name input.    
  ![RECIPE NAME](/guide_src/recipe_name.JPG)
  
  Add every parts of aliments. Type first letter of an aliment, then choose item in short list.    
  ![ALIMENT NAME](/guide_src/portion_typing_zone.JPG)    
  
  Add quantity to this part, in qty input using arrows or writting value.    
  As you have enter valid informations, you can click on add icon, part and global Glycemic Charge will be updated.
  ![PART QUANTITY](/guide_src/portion_qty_value.JPG)    
  
  All parts added showed under in part table.
  In case of mistake, each part added can be deleted, click on trash right, Global Glycemic Charge will be updated.    
  ![PART ITEMS](/guide_src/portions_table.JPG)    
  
  
  Write here some optional comments for this recipe.     
  ![RECIPE COMMENT ZONE](/guide_src/recipe_comment_zone.JPG)  
    
  when each required field is filled, it becomes possible to save clicking save button.    
  When new recipe is stored, you wil be automatically redirected to recipe main page and can view the new list item.    
  ![PART ITEMS](/guide_src/recipe_save_button.JPG)  

  
