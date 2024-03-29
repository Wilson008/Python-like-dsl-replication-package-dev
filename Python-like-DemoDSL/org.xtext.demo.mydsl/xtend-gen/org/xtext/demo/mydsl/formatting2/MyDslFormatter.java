/**
 * generated by Xtext 2.25.0
 */
package org.xtext.demo.mydsl.formatting2;

import com.google.inject.Inject;
import demodsl.Connector;
import demodsl.HardwareComponent;
import demodsl.Port;
import demodsl.PortGroup;
import demodsl.Root;
import demodsl.SoftwareComponent;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.demo.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MyDslGrammarAccess _myDslGrammarAccess;
  
  protected void _format(final Root root, @Extension final IFormattableDocument document) {
    EList<HardwareComponent> _hardwarecomponent = root.getHardwarecomponent();
    for (final HardwareComponent hardwareComponent : _hardwarecomponent) {
      document.<HardwareComponent>format(hardwareComponent);
    }
    EList<SoftwareComponent> _softwarecomponent = root.getSoftwarecomponent();
    for (final SoftwareComponent softwareComponent : _softwarecomponent) {
      document.<SoftwareComponent>format(softwareComponent);
    }
  }
  
  protected void _format(final SoftwareComponent softwareComponent, @Extension final IFormattableDocument document) {
    EList<Port> _port = softwareComponent.getPort();
    for (final Port port : _port) {
      document.<Port>format(port);
    }
    EList<PortGroup> _portgroup = softwareComponent.getPortgroup();
    for (final PortGroup portGroup : _portgroup) {
      document.<PortGroup>format(portGroup);
    }
    EList<Connector> _connector = softwareComponent.getConnector();
    for (final Connector connector : _connector) {
      document.<Connector>format(connector);
    }
  }
  
  public void format(final Object root, final IFormattableDocument document) {
    if (root instanceof XtextResource) {
      _format((XtextResource)root, document);
      return;
    } else if (root instanceof Root) {
      _format((Root)root, document);
      return;
    } else if (root instanceof SoftwareComponent) {
      _format((SoftwareComponent)root, document);
      return;
    } else if (root instanceof EObject) {
      _format((EObject)root, document);
      return;
    } else if (root == null) {
      _format((Void)null, document);
      return;
    } else if (root != null) {
      _format(root, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(root, document).toString());
    }
  }
}
