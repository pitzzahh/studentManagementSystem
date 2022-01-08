package version2.enhanced.processes.importingAndExporting;

import annotations.note;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import version2.enhanced.main.studentConstruct.Student;
import java.nio.charset.StandardCharsets;

public class FileProcessing {

    @note(description = "private constructor, this prevents any other packages from using this Class")
    private FileProcessing() {
		
	}

    /**
     * @param list of all students that will write to file.
     * @param path directory where the student list will be saved.
     */
    @note(description = "converts the ArrayList studentsList into a text file, <file name>.txt")
    public static void writeFile(final ArrayList<Student> list, final String path) {
	    try {
	    // creates a file stream in UTF-8
            FileOutputStream fileOutputStream = new FileOutputStream(path + ".txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            // write list
            for (Student student : list) {
                bufferedWriter.write(student.toString());
                bufferedWriter.newLine();
            }
            // close file
            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();

        }
	    catch (Exception ignored) {
	    }
        // return false if any error.
    }
    /**
     * @param path of the file that needs to be imported
     */
    @note(description = "reads the .bin files to be exported in the ArrayList studentsList" +
                        "returns a list of student read from the file")
    public static ArrayList<Student> readFileBinary(final String path, final String fileName) {
	    Student temporaryStudent;
        ArrayList<Student> studentsList = new ArrayList<>();

        try {
            // create file
            DataInputStream data_input_stream = new DataInputStream(new FileInputStream(path + fileName + ".bin"));

            // read size of list
            int size = data_input_stream.readInt();

            // read all
            for (int i = 0; i < size; i++) {
                temporaryStudent = new Student();
                temporaryStudent.setLrn(data_input_stream.readUTF());
                temporaryStudent.setFirstName(data_input_stream.readUTF());
                temporaryStudent.setLastName(data_input_stream.readUTF());
                temporaryStudent.setAge(data_input_stream.readByte());
                temporaryStudent.setGender((data_input_stream.readUTF()));
                temporaryStudent.setSchoolName(data_input_stream.readUTF());
                temporaryStudent.setCourseName(data_input_stream.readUTF());

                studentsList.add(temporaryStudent);
            }
            data_input_stream.close();
        }
        catch (Exception ignored) {
        }
        // returns student data.
        return studentsList;
    }
	/**
     * @param list of all students.
     * @param path that need to write.
     */
    @note(description = "converts the ArrayList studentsList into a binary file, <file name>.bin")
    public static void writeFileBinary(final ArrayList<Student> list, final String path) {
        try {
            // open file in binary mode, added .bin extension because the file when exported is already .bin file with the txt file(readable txt file)
            DataOutputStream data_output_stream = new DataOutputStream(new FileOutputStream(path + ".bin"));
            // determines the size of the arrayList to be used
            data_output_stream.writeInt(list.size());
            // list
            for (Student student : list) {
                data_output_stream.writeUTF(student.getId());
                data_output_stream.writeUTF(student.getFirstName());
                data_output_stream.writeUTF(student.getLastName());
                data_output_stream.writeByte(student.getAge());
                data_output_stream.writeUTF(student.getGender());
                data_output_stream.writeUTF(student.getSchoolName());
                data_output_stream.writeUTF(student.getCourseName());
            }
            // close
            data_output_stream.flush();
            data_output_stream.close();
        }
        catch (Exception ignored) {
        }
    }
}