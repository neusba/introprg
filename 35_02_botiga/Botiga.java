            // Si encuentra una instància con el mismo nombre
            if (vins[i].getNom().equals(vi.getNom())) {
               // no puede añadirla a la tienda, la devuelve
                return null;
            }
        }
        // Si no encuentra el mismo nombre y la tienda esta llena, devuelve
            return null;
    }

    public Vi cerca(String nom) {
        // recibo el nombre de un vino
        // normalizamos el nombre para poder buscarlo en la tienda
        nom = Vi.normalitzaNom(nom);
        // buscamos el mismo nombre en la tienda
        for (int i=0; i<vins.length; i++) {
            // Si la posicion encontrada es null, devuelve NULL
            if (vins[i] == null) {
                return null;
            }
            // Si lo encuentra
            if (vins[i].getNom().toLowerCase().equals(nom.toLowerCase())) {
               return vins[i];
            }
       }
        // Si acaba el recorrido de la tienda y no ha coincidido el nombre
        return null;
    }

    public Vi elimina(String nom) {
        nom = Vi.normalitzaNom(nom);
        for (int i=0; i<vins.length; i++) {
            // Si la posicion que encuentra es null
            if (vins[i] == null) {
                return null;
            }
            // Si encuentra el vino en la tienda
            if (vins[i].getNom().toLowerCase().equals(nom.toLowerCase())) {
                // comprueba stock
                if (vins[i].getEstoc() > 0) {
                    // si aun queda
                    return null;
                }
                // si no queda
                Vi copia = new Vi(vins[i].getNom(), vins[i].getPreu());
                copia = vins[i];
                vins[i] = null;
                return copia; 
           }
        }
        // Si no encuentra el vino
        return null;
    }
}

