package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.ComponentProvider;
import org.simplity.fm.core.data.Form;
import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.LinkedForm;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.SchemaData;
import org.simplity.fm.core.data.SchemaDataTable;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import org.simplity.fm.core.service.IServiceContext;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.test.gen.schema.StudentAssessmentDetailData;
import org.simplity.fm.test.gen.schema.StudentAssessmentDetailDataTable;
/** class for form marksForAssessment  */
public class MarksForAssessmentForm extends Form {
	protected static final String NAME = "marksForAssessment";
	protected static final String SCHEMA = "studentAssessmentDetail";
	protected static final  boolean[] OPS = {true, false, true, false, false, false};
/** constructor */
public MarksForAssessmentForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public MarksForAssessmentFd newFormData() {
		return new MarksForAssessmentFd(this, null, null, null);
	}

	@Override
	public MarksForAssessmentFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (MarksForAssessmentFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public MarksForAssessmentFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (MarksForAssessmentFd)super.parseKeys(json, ctx);
	}

	@Override
	public MarksForAssessmentFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (MarksForAssessmentFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public MarksForAssessmentFdt newFormDataTable() {
		return new MarksForAssessmentFdt(this, null, null, null);
	}

	@Override
	public MarksForAssessmentFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new MarksForAssessmentFd(this, (StudentAssessmentDetailData) schemaData, values, data);
	}

	@Override
	public MarksForAssessmentFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new MarksForAssessmentFdt(this, (StudentAssessmentDetailDataTable) table, values, linkedData);
	}
}
