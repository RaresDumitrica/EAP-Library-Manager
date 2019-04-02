package pakage1;

public enum Domains {
        INFORMATICA(0),
        MATEMATICA(1),
        LITERATURA(2),
        FIZICA(3),
        MECANICA(4);

        private Integer privateValue;


         Domains(Integer value){
            this.privateValue = value;
        }

        public Integer getValue(){
            return privateValue;
        }

}
