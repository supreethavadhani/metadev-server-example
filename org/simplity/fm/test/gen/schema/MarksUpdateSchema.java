package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.DbField;
import org.simplity.fm.core.data.Schema;
import org.simplity.fm.core.validn.IValidation;
import org.simplity.fm.core.data.DbAssistant;
import org.simplity.fm.core.service.IServiceContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import org.simplity.fm.core.data.ColumnType;
import org.simplity.fm.core.validn.DependentListValidation;
import org.simplity.fm.test.gen.DefinedDataTypes;

/**
 * class that represents structure of marksUpdate
 */ 
public class MarksUpdateSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("studentAssessmentId", 0, DefinedDataTypes.id, null, null, null, "student_assessment_id", ColumnType.RequiredData), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("subjectRegisterId", 2, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.PrimaryKey), 
			new DbField("assessmentSeqNo", 3, DefinedDataTypes.id, null, null, null, "assessment_seq_no", ColumnType.PrimaryKey), 
			new DbField("currentMarks", 4, DefinedDataTypes.text, null, null, null, "current_marks", ColumnType.OptionalData), 
			new DbField("studentId", 5, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.RequiredData), 
			new DbField("studentName", 6, DefinedDataTypes.text, null, null, null, "student_name", ColumnType.OptionalData), 
			new DbField("usn", 7, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData), 
			new DbField("subjectId", 8, DefinedDataTypes.id, null, null, null, "subject_id", ColumnType.RequiredData), 
			new DbField("subjectName", 9, DefinedDataTypes.text, null, null, null, "subject_name", ColumnType.OptionalData), 
			new DbField("testName", 10, DefinedDataTypes.text, null, null, null, "test_name", ColumnType.OptionalData), 
			new DbField("marks", 11, DefinedDataTypes.text, null, null, null, null, ColumnType.RequiredData), 
			new DbField("requesterName", 12, DefinedDataTypes.text, null, null, null, null, ColumnType.RequiredData), 
			new DbField("requesterPhone", 13, DefinedDataTypes.text, null, null, null, null, ColumnType.RequiredData), 
			new DbField("remarks", 14, DefinedDataTypes.text, null, null, null, null, ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {true, false, true, false, false, false};
	private static final String SELECT = "SELECT student_assessment_id, institute_id, subject_register_id, assessment_seq_no, current_marks, student_id, student_name, usn, subject_id, subject_name, test_name, null, null, null, null FROM marks_update";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	private static final  String INSERT = "INSERT INTO marks_update(student_assessment_id, institute_id, subject_register_id, assessment_seq_no, current_marks, student_id, student_name, usn, subject_id, subject_name, test_name, null, null, null, null) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	private static final String WHERE = " WHERE subject_register_id=? AND assessment_seq_no=? AND institute_id=?";
	private static final int[] WHERE_IDX = {2, 3, 1};
	private static final  String UPDATE = "UPDATE marks_update SET student_assessment_id= ? , current_marks= ? , student_id= ? , student_name= ? , usn= ? , subject_id= ? , subject_name= ? , test_name= ? , null= ? , null= ? , null= ? , null= ?  WHERE subject_register_id=? AND assessment_seq_no=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 2, 3, 1};
	private static final String DELETE = "DELETE FROM marks_update";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public MarksUpdateSchema() {
		this.name = "marksUpdate";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "marks_update";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(15, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public MarksUpdateData newSchemaData() {
		return new MarksUpdateData(this, null);
	}

	@Override
	protected MarksUpdateData newSchemaData(final Object[] data) {
		return new MarksUpdateData(this, data);
	}

	@Override
	public MarksUpdateData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (MarksUpdateData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public MarksUpdateData parseKeys(JsonObject json, IServiceContext ctx) {
		return (MarksUpdateData) super.parseKeys(json, ctx);
	}

	@Override
	public MarksUpdateDataTable newSchemaDataTable() {
		return new MarksUpdateDataTable(this, null);
	}

	@Override
	protected MarksUpdateDataTable newSchemaDataTable(final Object[][] data) {
		return new MarksUpdateDataTable(this, data);
	}

	@Override
	public MarksUpdateDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (MarksUpdateDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
