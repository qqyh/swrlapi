package org.protege.swrlapi.core.arguments;

import java.net.URI;
import java.util.List;

import org.protege.swrlapi.xsd.XSDDate;
import org.protege.swrlapi.xsd.XSDDateTime;
import org.protege.swrlapi.xsd.XSDDuration;
import org.protege.swrlapi.xsd.XSDTime;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLObjectProperty;

public interface SWRLBuiltInArgumentFactory
{
	SWRLVariableBuiltInArgument createVariableArgument(String variableName);

	SWRLVariableBuiltInArgument createUnboundVariableArgument(String variableName);

	SWRLClassBuiltInArgument createClassArgument(IRI uri);

	SWRLClassBuiltInArgument createClassArgument(OWLClass cls);

	SWRLIndividualBuiltInArgument createIndividualArgument(IRI uri);

	SWRLIndividualBuiltInArgument createIndividualArgument(OWLIndividual individual);

	SWRLObjectPropertyBuiltInArgument createObjectPropertyArgument(IRI uri);

	SWRLObjectPropertyBuiltInArgument createObjectPropertyArgument(OWLObjectProperty property);

	SWRLDataPropertyBuiltInArgument createDataPropertyArgument(IRI uri);

	SWRLDataPropertyBuiltInArgument createDataPropertyArgument(OWLDataProperty property);

	SWRLAnnotationPropertyBuiltInArgument createAnnotationPropertyArgument(IRI uri);

	SWRLAnnotationPropertyBuiltInArgument createAnnotationPropertyArgument(OWLAnnotationProperty property);

	SWRLDatatypeBuiltInArgument createDatatypeArgument(IRI uri);

	SWRLDatatypeBuiltInArgument createDatatypeArgument(OWLDatatype datatype);

	SWRLLiteralBuiltInArgument createLiteralArgument(OWLLiteral literal);

	SWRLLiteralBuiltInArgument createLiteralArgument(String s);

	SWRLLiteralBuiltInArgument createLiteralArgument(boolean b);

	SWRLLiteralBuiltInArgument createLiteralArgument(int i);

	SWRLLiteralBuiltInArgument createLiteralArgument(long l);

	SWRLLiteralBuiltInArgument createLiteralArgument(float f);

	SWRLLiteralBuiltInArgument createLiteralArgument(double d);

	SWRLLiteralBuiltInArgument createLiteralArgument(byte b);

	SWRLLiteralBuiltInArgument createLiteralArgument(URI iri);

	SWRLLiteralBuiltInArgument createLiteralArgument(XSDDate date);

	SWRLLiteralBuiltInArgument createLiteralArgument(XSDTime time);

	SWRLLiteralBuiltInArgument createLiteralArgument(XSDDateTime datetime);

	SWRLLiteralBuiltInArgument createLiteralArgument(XSDDuration duration);

	SWRLMultiArgument createMultiArgument();

	SWRLMultiArgument createMultiArgument(List<SWRLBuiltInArgument> arguments);

	SQWRLCollectionBuiltInArgument createSQWRLCollectionArgument(String queryName, String collectionName,
			String collectionID);
}