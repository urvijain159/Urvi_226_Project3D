package req_Repo_Pkg;

import java.io.IOException;

import java.util.ArrayList;

import common_Function_pkg.Utility_CommonFunctions;

public class Post_req_repo {
	
	public static String base_URI() {
	String baseURI="https://reqres.in/";
			return baseURI;
	}
	
	public static String post_resource() {
		String resource="api/users";
		return resource;
	}
	
	public static String Post_req_tc1() throws IOException {
	ArrayList<String> data=Utility_CommonFunctions.readdataexcel("Post_Test_Data","Post_tc1");
	String req_name=data.get(1);
	String req_job=data.get(2);
	
		String req_body="{\r\n"
				+ "    \"name\": \""+req_name+"\",\r\n"
				+ "    \"job\": \""+req_job+"\"\r\n"
				+ "}";
		
		return req_body;
	}
	
	public static String Post_req_tc2( ) throws IOException {
		ArrayList<String> data=Utility_CommonFunctions.readdataexcel("Post_Test_Data","Post_tc2");
		String req_name=data.get(1);
		String req_job=data.get(2);
		
			String req_body="{\r\n"
					+ "    \"name\": \""+req_name+"\",\r\n"
					+ "    \"job\": \""+req_job+"\"\r\n"
					+ "}";
			
			return req_body;
		}
	
	public static String Post_req_tc3( ) throws IOException {
		ArrayList<String> data=Utility_CommonFunctions.readdataexcel("Post_Test_Data","Post_tc3");
		String req_name=data.get(1);
		String req_job=data.get(2);
		
			String req_body="{\r\n"
					+ "    \"name\": \""+req_name+"\",\r\n"
					+ "    \"job\": \""+req_job+"\"\r\n"
					+ "}";
			
			return req_body;
		}
	
	
		}
