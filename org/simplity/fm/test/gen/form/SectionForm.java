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
import org.simplity.fm.test.gen.schema.SectionData;
import org.simplity.fm.test.gen.schema.SectionDataTable;
/** class for form section  */
public class SectionForm extends Form {
	protected static final String NAME = "section";
	protected static final String SCHEMA = "section";
	protected static final  boolean[] OPS = {true, true, true, false, true, true};
/** constructor */
public SectionForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public SectionFd newFormData() {
		return new SectionFd(this, null, null, null);
	}

	@Override
	public SectionFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (SectionFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public SectionFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (SectionFd)super.parseKeys(json, ctx);
	}

	@Override
	public SectionFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (SectionFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public SectionFdt newFormDataTable() {
		return new SectionFdt(this, null, null, null);
	}

	@Override
	public SectionFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new SectionFd(this, (SectionData) schemaData, values, data);
	}

	@Override
	public SectionFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new SectionFdt(this, (SectionDataTable) table, values, linkedData);
	}
}
