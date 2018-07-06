
INSERT INTO PUBLIC.CATEGORY(ID, NAME) VALUES
(1, 'Fruits'),
(2, 'Legumes'),
(3, 'Viandes');
 
INSERT INTO PUBLIC.ALIMENT(ID, CARB, CG, ENERGY, FIBRE, IG, LIPID, NAME, PROTEIN, SALT, SUGAR, FK_IDCATEGORY) VALUES
(1, 0.0, 10.0, 10, 2.0, 65, 0.0, 'Ananas', 0.0, 0.0, 0.0, 1),
(2, 0.0, 0.0, 0, 2.0, 10, 0.0, 'Tomate', 0.0, 0.0, 0.0, 2),
(3, 0.0, 0.0, 10, 2.0, 65, 0.0, 'Veau', 0.0, 0.0, 0.0, 3);              


