package orgexample_spring_demo1;

public class SpecialEditionCD extends CD implements MyDetails{
	
		private String specialFeature;

		public SpecialEditionCD() {
			super();
		}

		public SpecialEditionCD(int id,String name,String specialFeature) {
			super(id,name);
			this.specialFeature = specialFeature;
		}

		public String getSpecialFeature() {
			return specialFeature;
		}

		public void setSpecialFeature(String specialFeature) {
			this.specialFeature = specialFeature;
		}

		@Override
		public String getDetails() {
			// TODO Auto-generated method stub
			return "Id: "+getId()+" Name: "+getName()+" Special-Feacture: "+specialFeature;
		}
		

	}