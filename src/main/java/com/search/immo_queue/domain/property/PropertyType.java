package com.search.immo_queue.domain.property;

public enum PropertyType {
    APARTMENT("Etagenwohnung","apartment"),
    PENTHOUSE("DACHGESCHOSS","penthouse"),
    GROUND_FLOOR("HOCHPARTERRE","ground floor" ),
    HOUSE("HAUS","house");

    final String germanName;
    final String englishName;

    PropertyType(String germanName, String englishName){
        this.germanName = germanName;
        this.englishName = englishName;
    }

    public String germanName(){
        return germanName;
    }

    public String englishName(){
        return englishName;
    }
}