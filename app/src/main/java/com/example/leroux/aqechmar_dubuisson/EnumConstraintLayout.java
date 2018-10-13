package com.example.leroux.aqechmar_dubuisson;

enum EnumConstraintLayout {
    MEDIC1(R.drawable.medicament1,"Médicament 1","Voie cutanée"),
    MEDIC2(R.drawable.medicament2,"Médicament 2","Voie orale"),
    MEDIC3(R.drawable.medicament3,"Médicament 3","Voie intraarticulaire"),
    MEDIC4(R.drawable.medicament4,"Médicament 4","Voie inhalée"),
    MEDIC5(R.drawable.medicament5,"Médicament 5","Voie intraveineuse"),
    MEDIC6(R.drawable.medicament6,"Médicament 6","Voie transdermique"),
    MEDIC7(R.drawable.medicament7,"Médicament 7","Voie ophtalmique");
    /*    background,
          nom,
          description;*/

    public String name;
    public int drawable;
    public String description;

    EnumConstraintLayout(int drawable,String name, String description) {
        this.drawable = drawable;
        this.name = name;
        this.description = description;
    }
}
