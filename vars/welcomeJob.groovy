import com.sharedLibraryTest.BuildClass 

def call(String name = 'Admin') {
	echo "Welcome, ${name}."
	def buildingMaven = new Building_Maven(script:this)
	buildingMaven.Maven()
		
}
