package com.example.leroux.aqechmar_dubuisson;

import android.support.constraint.ConstraintLayout;

enum EnumConstraintLayout {
    MEDIC1(R.drawable.medicament1,"Médicament 1","Voie cutanée",R.id.cLMedic1),
    MEDIC2(R.drawable.medicament2,"Médicament 2","Voie orale",R.id.cLMedic2),
    MEDIC3(R.drawable.medicament3,"Médicament 3","Voie intraarticulaire",R.id.cLMedic3),
    MEDIC4(R.drawable.medicament4,"Médicament 4","Voie inhalée",R.id.cLMedic4),
    MEDIC5(R.drawable.medicament5,"Médicament 5","Voie intraveineuse",R.id.cLMedic5),
    MEDIC6(R.drawable.medicament6,"Médicament 6","Voie transdermique",R.id.cLMedic6),
    MEDIC7(R.drawable.medicament7,"Médicament 7","Voie ophtalmique",R.id.cLMedic7);
    /*    background,
          nom,
          description;*/

    public int drawable;
    public String name;
    public String description;
    public int layout;


    EnumConstraintLayout(int drawable, String name, String description, int layout) {
        this.drawable = drawable;
        this.name = name;
        this.description = description;
        this.layout = layout;
    }

}
