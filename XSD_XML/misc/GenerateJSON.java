package submit;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class GenerateJSON {
	public static int INDENTATION = 4;
	public static String XML_STRING = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" + "<stocks>\n"
			+ "  <stock>\n" + "    <tickerSymbol>CRI</tickerSymbol>\n" + "    <releaseDate>2019-01-09</releaseDate>\n"
			+ "    <price currency=\"USD\">747.2</price>\n" + "    <company>\n" + "      <name>ExxonMobil</name>\n"
			+ "      <totalEmployees>121</totalEmployees>\n" + "      <country>ARMENIA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>GJA</tickerSymbol>\n"
			+ "    <releaseDate>2015-12-21</releaseDate>\n" + "    <price currency=\"USD\">304.6</price>\n"
			+ "    <company>\n" + "      <name>Roche Holding</name>\n" + "      <totalEmployees>57</totalEmployees>\n"
			+ "      <country>BELARUS</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>KSF</tickerSymbol>\n" + "    <releaseDate>2018-11-02</releaseDate>\n"
			+ "    <price currency=\"USD\">196.9</price>\n" + "    <company>\n" + "      <name>Roche Holding</name>\n"
			+ "      <totalEmployees>116</totalEmployees>\n" + "      <country>AZERBAIJAN</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>ESI</tickerSymbol>\n"
			+ "    <releaseDate>2011-02-25</releaseDate>\n" + "    <price currency=\"USD\">119.6</price>\n"
			+ "    <company>\n" + "      <name>Bank Of America</name>\n"
			+ "      <totalEmployees>114</totalEmployees>\n" + "      <country>ANGOLA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>DJK</tickerSymbol>\n"
			+ "    <releaseDate>2006-08-21</releaseDate>\n" + "    <price currency=\"USD\">256.8</price>\n"
			+ "    <company>\n" + "      <name>Procter Gamble</name>\n" + "      <totalEmployees>70</totalEmployees>\n"
			+ "      <country>AFGHANISTAN</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>QXD</tickerSymbol>\n" + "    <releaseDate>2022-12-25</releaseDate>\n"
			+ "    <price currency=\"USD\">221.3</price>\n" + "    <company>\n" + "      <name>Walt Disney</name>\n"
			+ "      <totalEmployees>130</totalEmployees>\n" + "      <country>AFGHANISTAN</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>JGV</tickerSymbol>\n"
			+ "    <releaseDate>2019-10-06</releaseDate>\n" + "    <price currency=\"USD\">263.3</price>\n"
			+ "    <company>\n" + "      <name>Ping An Insurance Group</name>\n"
			+ "      <totalEmployees>45</totalEmployees>\n" + "      <country>BELARUS</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>XZS</tickerSymbol>\n"
			+ "    <releaseDate>2013-06-07</releaseDate>\n" + "    <price currency=\"USD\">496.0</price>\n"
			+ "    <company>\n" + "      <name>Verizon Communications</name>\n"
			+ "      <totalEmployees>61</totalEmployees>\n" + "      <country>BARBADOS</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>QFH</tickerSymbol>\n"
			+ "    <releaseDate>2013-06-23</releaseDate>\n" + "    <price currency=\"USD\">240.6</price>\n"
			+ "    <company>\n" + "      <name>ExxonMobil</name>\n" + "      <totalEmployees>91</totalEmployees>\n"
			+ "      <country>ANGOLA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>WQM</tickerSymbol>\n" + "    <releaseDate>2007-08-06</releaseDate>\n"
			+ "    <price currency=\"USD\">808.6</price>\n" + "    <company>\n" + "      <name>Cisco Systems</name>\n"
			+ "      <totalEmployees>127</totalEmployees>\n" + "      <country>AUSTRIA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>JDU</tickerSymbol>\n"
			+ "    <releaseDate>2018-10-05</releaseDate>\n" + "    <price currency=\"USD\">277.4</price>\n"
			+ "    <company>\n" + "      <name>Cisco Systems</name>\n" + "      <totalEmployees>70</totalEmployees>\n"
			+ "      <country>ARGENTINA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>RFF</tickerSymbol>\n" + "    <releaseDate>2013-08-01</releaseDate>\n"
			+ "    <price currency=\"USD\">776.0</price>\n" + "    <company>\n" + "      <name>AT T</name>\n"
			+ "      <totalEmployees>106</totalEmployees>\n" + "      <country>ANDORRA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>RPI</tickerSymbol>\n"
			+ "    <releaseDate>2007-01-09</releaseDate>\n" + "    <price currency=\"USD\">924.8</price>\n"
			+ "    <company>\n" + "      <name>Taiwan Semiconductor</name>\n"
			+ "      <totalEmployees>110</totalEmployees>\n" + "      <country>ANGOLA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>BDF</tickerSymbol>\n"
			+ "    <releaseDate>2008-01-26</releaseDate>\n" + "    <price currency=\"USD\">844.2</price>\n"
			+ "    <company>\n" + "      <name>Intel</name>\n" + "      <totalEmployees>92</totalEmployees>\n"
			+ "      <country>BARBADOS</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>PSB</tickerSymbol>\n" + "    <releaseDate>2014-07-12</releaseDate>\n"
			+ "    <price currency=\"USD\">291.5</price>\n" + "    <company>\n"
			+ "      <name>Taiwan Semiconductor</name>\n" + "      <totalEmployees>117</totalEmployees>\n"
			+ "      <country>ARMENIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>BNO</tickerSymbol>\n" + "    <releaseDate>2011-08-07</releaseDate>\n"
			+ "    <price currency=\"USD\">259.0</price>\n" + "    <company>\n" + "      <name>Intel</name>\n"
			+ "      <totalEmployees>109</totalEmployees>\n" + "      <country>ALBANIA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>NUY</tickerSymbol>\n"
			+ "    <releaseDate>2016-11-08</releaseDate>\n" + "    <price currency=\"USD\">782.5</price>\n"
			+ "    <company>\n" + "      <name>Procter Gamble</name>\n" + "      <totalEmployees>41</totalEmployees>\n"
			+ "      <country>ALBANIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>SAT</tickerSymbol>\n" + "    <releaseDate>2008-10-23</releaseDate>\n"
			+ "    <price currency=\"USD\">800.9</price>\n" + "    <company>\n" + "      <name>Mastercard</name>\n"
			+ "      <totalEmployees>82</totalEmployees>\n" + "      <country>AUSTRALIA</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>INR</tickerSymbol>\n"
			+ "    <releaseDate>2020-03-01</releaseDate>\n" + "    <price currency=\"USD\">974.4</price>\n"
			+ "    <company>\n" + "      <name>Roche Holding</name>\n" + "      <totalEmployees>109</totalEmployees>\n"
			+ "      <country>ALBANIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>FMP</tickerSymbol>\n" + "    <releaseDate>2019-04-17</releaseDate>\n"
			+ "    <price currency=\"USD\">220.5</price>\n" + "    <company>\n" + "      <name>JPMorgan Chase</name>\n"
			+ "      <totalEmployees>70</totalEmployees>\n" + "      <country>BARBADOS</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>QVB</tickerSymbol>\n"
			+ "    <releaseDate>2006-12-16</releaseDate>\n" + "    <price currency=\"USD\">948.7</price>\n"
			+ "    <company>\n" + "      <name>Alibaba</name>\n" + "      <totalEmployees>135</totalEmployees>\n"
			+ "      <country>ALGERIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>IDT</tickerSymbol>\n" + "    <releaseDate>2014-08-27</releaseDate>\n"
			+ "    <price currency=\"USD\">151.8</price>\n" + "    <company>\n" + "      <name>Microsoft</name>\n"
			+ "      <totalEmployees>92</totalEmployees>\n" + "      <country>BANGLADESH</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>XLP</tickerSymbol>\n"
			+ "    <releaseDate>2016-11-01</releaseDate>\n" + "    <price currency=\"USD\">516.2</price>\n"
			+ "    <company>\n" + "      <name>Pfizer</name>\n" + "      <totalEmployees>138</totalEmployees>\n"
			+ "      <country>ANDORRA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>AWN</tickerSymbol>\n" + "    <releaseDate>2023-01-07</releaseDate>\n"
			+ "    <price currency=\"USD\">911.2</price>\n" + "    <company>\n" + "      <name>JPMorgan Chase</name>\n"
			+ "      <totalEmployees>138</totalEmployees>\n" + "      <country>ARMENIA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>GSS</tickerSymbol>\n"
			+ "    <releaseDate>2014-05-05</releaseDate>\n" + "    <price currency=\"USD\">155.7</price>\n"
			+ "    <company>\n" + "      <name>Samsung Electronics</name>\n"
			+ "      <totalEmployees>120</totalEmployees>\n" + "      <country>BAHRAIN</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>AOV</tickerSymbol>\n"
			+ "    <releaseDate>2012-07-08</releaseDate>\n" + "    <price currency=\"USD\">993.5</price>\n"
			+ "    <company>\n" + "      <name>Intel</name>\n" + "      <totalEmployees>54</totalEmployees>\n"
			+ "      <country>AUSTRIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>QCO</tickerSymbol>\n" + "    <releaseDate>2018-01-12</releaseDate>\n"
			+ "    <price currency=\"USD\">164.7</price>\n" + "    <company>\n"
			+ "      <name>Verizon Communications</name>\n" + "      <totalEmployees>108</totalEmployees>\n"
			+ "      <country>ARMENIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>DRP</tickerSymbol>\n" + "    <releaseDate>2005-05-13</releaseDate>\n"
			+ "    <price currency=\"USD\">266.3</price>\n" + "    <company>\n" + "      <name>Cisco Systems</name>\n"
			+ "      <totalEmployees>63</totalEmployees>\n" + "      <country>AUSTRIA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>CPK</tickerSymbol>\n"
			+ "    <releaseDate>2021-01-11</releaseDate>\n" + "    <price currency=\"USD\">472.5</price>\n"
			+ "    <company>\n" + "      <name>Pfizer</name>\n" + "      <totalEmployees>60</totalEmployees>\n"
			+ "      <country>ARMENIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>NXI</tickerSymbol>\n" + "    <releaseDate>2011-06-23</releaseDate>\n"
			+ "    <price currency=\"USD\">834.6</price>\n" + "    <company>\n" + "      <name>Walmart</name>\n"
			+ "      <totalEmployees>124</totalEmployees>\n" + "      <country>BARBADOS</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>QWM</tickerSymbol>\n"
			+ "    <releaseDate>2014-01-18</releaseDate>\n" + "    <price currency=\"USD\">802.3</price>\n"
			+ "    <company>\n" + "      <name>Apple</name>\n" + "      <totalEmployees>99</totalEmployees>\n"
			+ "      <country>ALGERIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>XGI</tickerSymbol>\n" + "    <releaseDate>2007-08-19</releaseDate>\n"
			+ "    <price currency=\"USD\">296.7</price>\n" + "    <company>\n" + "      <name>Intel</name>\n"
			+ "      <totalEmployees>71</totalEmployees>\n" + "      <country>ANDORRA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>TJB</tickerSymbol>\n"
			+ "    <releaseDate>2020-09-02</releaseDate>\n" + "    <price currency=\"USD\">384.8</price>\n"
			+ "    <company>\n" + "      <name>Facebook</name>\n" + "      <totalEmployees>51</totalEmployees>\n"
			+ "      <country>ALGERIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>PSX</tickerSymbol>\n" + "    <releaseDate>2014-01-25</releaseDate>\n"
			+ "    <price currency=\"USD\">646.2</price>\n" + "    <company>\n" + "      <name>Johnson Johnson</name>\n"
			+ "      <totalEmployees>106</totalEmployees>\n" + "      <country>AUSTRALIA</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>TVE</tickerSymbol>\n"
			+ "    <releaseDate>2017-10-10</releaseDate>\n" + "    <price currency=\"USD\">224.6</price>\n"
			+ "    <company>\n" + "      <name>Samsung Electronics</name>\n"
			+ "      <totalEmployees>123</totalEmployees>\n" + "      <country>ALGERIA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>LAG</tickerSymbol>\n"
			+ "    <releaseDate>2016-01-16</releaseDate>\n" + "    <price currency=\"USD\">386.7</price>\n"
			+ "    <company>\n" + "      <name>Visa</name>\n" + "      <totalEmployees>93</totalEmployees>\n"
			+ "      <country>AUSTRALIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>TLO</tickerSymbol>\n" + "    <releaseDate>2013-01-09</releaseDate>\n"
			+ "    <price currency=\"USD\">999.2</price>\n" + "    <company>\n" + "      <name>Walmart</name>\n"
			+ "      <totalEmployees>138</totalEmployees>\n" + "      <country>ANTIGUA AND BARBUDA</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>RDP</tickerSymbol>\n"
			+ "    <releaseDate>2007-01-08</releaseDate>\n" + "    <price currency=\"USD\">523.7</price>\n"
			+ "    <company>\n" + "      <name>Amazon</name>\n" + "      <totalEmployees>101</totalEmployees>\n"
			+ "      <country>AUSTRIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>XFZ</tickerSymbol>\n" + "    <releaseDate>2020-01-14</releaseDate>\n"
			+ "    <price currency=\"USD\">30.1</price>\n" + "    <company>\n" + "      <name>Walmart</name>\n"
			+ "      <totalEmployees>69</totalEmployees>\n" + "      <country>ALBANIA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>BWJ</tickerSymbol>\n"
			+ "    <releaseDate>2008-09-26</releaseDate>\n" + "    <price currency=\"USD\">968.9</price>\n"
			+ "    <company>\n" + "      <name>Intel</name>\n" + "      <totalEmployees>89</totalEmployees>\n"
			+ "      <country>BAHRAIN</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>KLA</tickerSymbol>\n" + "    <releaseDate>2017-12-26</releaseDate>\n"
			+ "    <price currency=\"USD\">408.8</price>\n" + "    <company>\n" + "      <name>JPMorgan Chase</name>\n"
			+ "      <totalEmployees>59</totalEmployees>\n" + "      <country>ALGERIA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>AOO</tickerSymbol>\n"
			+ "    <releaseDate>2023-10-21</releaseDate>\n" + "    <price currency=\"USD\">556.1</price>\n"
			+ "    <company>\n" + "      <name>Facebook</name>\n" + "      <totalEmployees>95</totalEmployees>\n"
			+ "      <country>ARGENTINA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>QCF</tickerSymbol>\n" + "    <releaseDate>2017-09-08</releaseDate>\n"
			+ "    <price currency=\"USD\">281.6</price>\n" + "    <company>\n" + "      <name>Intel</name>\n"
			+ "      <totalEmployees>96</totalEmployees>\n" + "      <country>ARMENIA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>QMF</tickerSymbol>\n"
			+ "    <releaseDate>2011-11-11</releaseDate>\n" + "    <price currency=\"USD\">299.6</price>\n"
			+ "    <company>\n" + "      <name>ExxonMobil</name>\n" + "      <totalEmployees>127</totalEmployees>\n"
			+ "      <country>BAHAMAS</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>UOC</tickerSymbol>\n" + "    <releaseDate>2009-06-28</releaseDate>\n"
			+ "    <price currency=\"USD\">502.8</price>\n" + "    <company>\n" + "      <name>Amazon</name>\n"
			+ "      <totalEmployees>116</totalEmployees>\n" + "      <country>ALGERIA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>WRF</tickerSymbol>\n"
			+ "    <releaseDate>2023-11-27</releaseDate>\n" + "    <price currency=\"USD\">751.1</price>\n"
			+ "    <company>\n" + "      <name>Cisco Systems</name>\n" + "      <totalEmployees>138</totalEmployees>\n"
			+ "      <country>BARBADOS</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>YOK</tickerSymbol>\n" + "    <releaseDate>2012-11-26</releaseDate>\n"
			+ "    <price currency=\"USD\">349.2</price>\n" + "    <company>\n"
			+ "      <name>Taiwan Semiconductor</name>\n" + "      <totalEmployees>56</totalEmployees>\n"
			+ "      <country>ALGERIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>KWF</tickerSymbol>\n" + "    <releaseDate>2012-08-04</releaseDate>\n"
			+ "    <price currency=\"USD\">308.3</price>\n" + "    <company>\n" + "      <name>Mastercard</name>\n"
			+ "      <totalEmployees>75</totalEmployees>\n" + "      <country>BELARUS</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>IDR</tickerSymbol>\n"
			+ "    <releaseDate>2019-04-06</releaseDate>\n" + "    <price currency=\"USD\">757.9</price>\n"
			+ "    <company>\n" + "      <name>AT T</name>\n" + "      <totalEmployees>84</totalEmployees>\n"
			+ "      <country>BARBADOS</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>ORX</tickerSymbol>\n" + "    <releaseDate>2018-08-08</releaseDate>\n"
			+ "    <price currency=\"USD\">113.8</price>\n" + "    <company>\n"
			+ "      <name>Tencent Holdings</name>\n" + "      <totalEmployees>93</totalEmployees>\n"
			+ "      <country>ALBANIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>QJL</tickerSymbol>\n" + "    <releaseDate>2013-10-18</releaseDate>\n"
			+ "    <price currency=\"USD\">595.2</price>\n" + "    <company>\n" + "      <name>Amazon</name>\n"
			+ "      <totalEmployees>69</totalEmployees>\n" + "      <country>BAHAMAS</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>FXB</tickerSymbol>\n"
			+ "    <releaseDate>2008-03-02</releaseDate>\n" + "    <price currency=\"USD\">742.6</price>\n"
			+ "    <company>\n" + "      <name>ICBC</name>\n" + "      <totalEmployees>101</totalEmployees>\n"
			+ "      <country>AFGHANISTAN</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>LSZ</tickerSymbol>\n" + "    <releaseDate>2020-02-09</releaseDate>\n"
			+ "    <price currency=\"USD\">794.4</price>\n" + "    <company>\n" + "      <name>Visa</name>\n"
			+ "      <totalEmployees>83</totalEmployees>\n" + "      <country>AFGHANISTAN</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>USY</tickerSymbol>\n"
			+ "    <releaseDate>2011-10-11</releaseDate>\n" + "    <price currency=\"USD\">226.2</price>\n"
			+ "    <company>\n" + "      <name>Pfizer</name>\n" + "      <totalEmployees>124</totalEmployees>\n"
			+ "      <country>BAHAMAS</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>CRW</tickerSymbol>\n" + "    <releaseDate>2015-03-06</releaseDate>\n"
			+ "    <price currency=\"USD\">810.9</price>\n" + "    <company>\n" + "      <name>Cisco Systems</name>\n"
			+ "      <totalEmployees>123</totalEmployees>\n" + "      <country>ANGOLA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>TKB</tickerSymbol>\n"
			+ "    <releaseDate>2022-05-07</releaseDate>\n" + "    <price currency=\"USD\">81.6</price>\n"
			+ "    <company>\n" + "      <name>Facebook</name>\n" + "      <totalEmployees>98</totalEmployees>\n"
			+ "      <country>ALGERIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>ZLG</tickerSymbol>\n" + "    <releaseDate>2021-07-02</releaseDate>\n"
			+ "    <price currency=\"USD\">733.7</price>\n" + "    <company>\n" + "      <name>ICBC</name>\n"
			+ "      <totalEmployees>138</totalEmployees>\n" + "      <country>ANDORRA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>KTL</tickerSymbol>\n"
			+ "    <releaseDate>2008-01-04</releaseDate>\n" + "    <price currency=\"USD\">925.6</price>\n"
			+ "    <company>\n" + "      <name>Bank Of America</name>\n"
			+ "      <totalEmployees>123</totalEmployees>\n" + "      <country>ANTIGUA AND BARBUDA</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>RVF</tickerSymbol>\n"
			+ "    <releaseDate>2007-06-16</releaseDate>\n" + "    <price currency=\"USD\">566.0</price>\n"
			+ "    <company>\n" + "      <name>Walmart</name>\n" + "      <totalEmployees>78</totalEmployees>\n"
			+ "      <country>ALGERIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>FKS</tickerSymbol>\n" + "    <releaseDate>2010-06-28</releaseDate>\n"
			+ "    <price currency=\"USD\">940.8</price>\n" + "    <company>\n"
			+ "      <name>Tencent Holdings</name>\n" + "      <totalEmployees>109</totalEmployees>\n"
			+ "      <country>BARBADOS</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>WTF</tickerSymbol>\n" + "    <releaseDate>2012-08-03</releaseDate>\n"
			+ "    <price currency=\"USD\">641.7</price>\n" + "    <company>\n" + "      <name>Roche Holding</name>\n"
			+ "      <totalEmployees>103</totalEmployees>\n" + "      <country>AFGHANISTAN</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>FBH</tickerSymbol>\n"
			+ "    <releaseDate>2007-08-22</releaseDate>\n" + "    <price currency=\"USD\">929.0</price>\n"
			+ "    <company>\n" + "      <name>Visa</name>\n" + "      <totalEmployees>70</totalEmployees>\n"
			+ "      <country>ANDORRA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>IFM</tickerSymbol>\n" + "    <releaseDate>2007-02-13</releaseDate>\n"
			+ "    <price currency=\"USD\">879.7</price>\n" + "    <company>\n" + "      <name>Microsoft</name>\n"
			+ "      <totalEmployees>99</totalEmployees>\n" + "      <country>BAHAMAS</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>VJR</tickerSymbol>\n"
			+ "    <releaseDate>2019-09-05</releaseDate>\n" + "    <price currency=\"USD\">941.2</price>\n"
			+ "    <company>\n" + "      <name>Intel</name>\n" + "      <totalEmployees>122</totalEmployees>\n"
			+ "      <country>ANDORRA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>HTT</tickerSymbol>\n" + "    <releaseDate>2023-08-01</releaseDate>\n"
			+ "    <price currency=\"USD\">593.5</price>\n" + "    <company>\n" + "      <name>ICBC</name>\n"
			+ "      <totalEmployees>40</totalEmployees>\n" + "      <country>BANGLADESH</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>YMU</tickerSymbol>\n"
			+ "    <releaseDate>2016-08-10</releaseDate>\n" + "    <price currency=\"USD\">502.2</price>\n"
			+ "    <company>\n" + "      <name>Verizon Communications</name>\n"
			+ "      <totalEmployees>62</totalEmployees>\n" + "      <country>BANGLADESH</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>MOZ</tickerSymbol>\n"
			+ "    <releaseDate>2017-11-17</releaseDate>\n" + "    <price currency=\"USD\">874.7</price>\n"
			+ "    <company>\n" + "      <name>Walmart</name>\n" + "      <totalEmployees>88</totalEmployees>\n"
			+ "      <country>AUSTRALIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>NHR</tickerSymbol>\n" + "    <releaseDate>2010-06-10</releaseDate>\n"
			+ "    <price currency=\"USD\">264.6</price>\n" + "    <company>\n" + "      <name>Alibaba</name>\n"
			+ "      <totalEmployees>125</totalEmployees>\n" + "      <country>BANGLADESH</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>OJJ</tickerSymbol>\n"
			+ "    <releaseDate>2018-04-28</releaseDate>\n" + "    <price currency=\"USD\">143.6</price>\n"
			+ "    <company>\n" + "      <name>ICBC</name>\n" + "      <totalEmployees>139</totalEmployees>\n"
			+ "      <country>ANDORRA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>BQZ</tickerSymbol>\n" + "    <releaseDate>2010-08-25</releaseDate>\n"
			+ "    <price currency=\"USD\">519.5</price>\n" + "    <company>\n" + "      <name>Intel</name>\n"
			+ "      <totalEmployees>53</totalEmployees>\n" + "      <country>BARBADOS</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>MXC</tickerSymbol>\n"
			+ "    <releaseDate>2012-06-12</releaseDate>\n" + "    <price currency=\"USD\">323.9</price>\n"
			+ "    <company>\n" + "      <name>Johnson Johnson</name>\n" + "      <totalEmployees>99</totalEmployees>\n"
			+ "      <country>ALGERIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>ILD</tickerSymbol>\n" + "    <releaseDate>2018-10-22</releaseDate>\n"
			+ "    <price currency=\"USD\">367.9</price>\n" + "    <company>\n" + "      <name>Microsoft</name>\n"
			+ "      <totalEmployees>138</totalEmployees>\n" + "      <country>BARBADOS</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>BWX</tickerSymbol>\n"
			+ "    <releaseDate>2018-07-08</releaseDate>\n" + "    <price currency=\"USD\">238.9</price>\n"
			+ "    <company>\n" + "      <name>Nestle</name>\n" + "      <totalEmployees>50</totalEmployees>\n"
			+ "      <country>BAHRAIN</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>FEX</tickerSymbol>\n" + "    <releaseDate>2011-01-01</releaseDate>\n"
			+ "    <price currency=\"USD\">513.9</price>\n" + "    <company>\n" + "      <name>Procter Gamble</name>\n"
			+ "      <totalEmployees>97</totalEmployees>\n" + "      <country>ARMENIA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>OGP</tickerSymbol>\n"
			+ "    <releaseDate>2021-02-14</releaseDate>\n" + "    <price currency=\"USD\">249.3</price>\n"
			+ "    <company>\n" + "      <name>ExxonMobil</name>\n" + "      <totalEmployees>99</totalEmployees>\n"
			+ "      <country>AFGHANISTAN</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>FXJ</tickerSymbol>\n" + "    <releaseDate>2008-01-19</releaseDate>\n"
			+ "    <price currency=\"USD\">580.0</price>\n" + "    <company>\n"
			+ "      <name>Royal Dutch Shell</name>\n" + "      <totalEmployees>117</totalEmployees>\n"
			+ "      <country>AUSTRALIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>FQA</tickerSymbol>\n" + "    <releaseDate>2016-10-04</releaseDate>\n"
			+ "    <price currency=\"USD\">857.1</price>\n" + "    <company>\n" + "      <name>Microsoft</name>\n"
			+ "      <totalEmployees>112</totalEmployees>\n" + "      <country>ANDORRA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>VFY</tickerSymbol>\n"
			+ "    <releaseDate>2006-06-07</releaseDate>\n" + "    <price currency=\"USD\">563.3</price>\n"
			+ "    <company>\n" + "      <name>Pfizer</name>\n" + "      <totalEmployees>53</totalEmployees>\n"
			+ "      <country>ALGERIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>VRQ</tickerSymbol>\n" + "    <releaseDate>2012-01-22</releaseDate>\n"
			+ "    <price currency=\"USD\">984.9</price>\n" + "    <company>\n" + "      <name>Intel</name>\n"
			+ "      <totalEmployees>64</totalEmployees>\n" + "      <country>ANDORRA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>QQU</tickerSymbol>\n"
			+ "    <releaseDate>2019-06-28</releaseDate>\n" + "    <price currency=\"USD\">553.0</price>\n"
			+ "    <company>\n" + "      <name>AT T</name>\n" + "      <totalEmployees>83</totalEmployees>\n"
			+ "      <country>ANGOLA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>WGF</tickerSymbol>\n" + "    <releaseDate>2005-12-26</releaseDate>\n"
			+ "    <price currency=\"USD\">907.7</price>\n" + "    <company>\n" + "      <name>JPMorgan Chase</name>\n"
			+ "      <totalEmployees>137</totalEmployees>\n" + "      <country>BELARUS</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>UJJ</tickerSymbol>\n"
			+ "    <releaseDate>2011-04-19</releaseDate>\n" + "    <price currency=\"USD\">112.2</price>\n"
			+ "    <company>\n" + "      <name>Facebook</name>\n" + "      <totalEmployees>101</totalEmployees>\n"
			+ "      <country>AUSTRALIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>OHT</tickerSymbol>\n" + "    <releaseDate>2013-12-14</releaseDate>\n"
			+ "    <price currency=\"USD\">361.3</price>\n" + "    <company>\n" + "      <name>ExxonMobil</name>\n"
			+ "      <totalEmployees>70</totalEmployees>\n" + "      <country>ANTIGUA AND BARBUDA</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>ZRT</tickerSymbol>\n"
			+ "    <releaseDate>2021-01-28</releaseDate>\n" + "    <price currency=\"USD\">790.0</price>\n"
			+ "    <company>\n" + "      <name>Facebook</name>\n" + "      <totalEmployees>59</totalEmployees>\n"
			+ "      <country>AFGHANISTAN</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>NHE</tickerSymbol>\n" + "    <releaseDate>2010-10-21</releaseDate>\n"
			+ "    <price currency=\"USD\">179.4</price>\n" + "    <company>\n" + "      <name>Johnson Johnson</name>\n"
			+ "      <totalEmployees>102</totalEmployees>\n" + "      <country>BELARUS</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>RHN</tickerSymbol>\n"
			+ "    <releaseDate>2021-02-25</releaseDate>\n" + "    <price currency=\"USD\">74.5</price>\n"
			+ "    <company>\n" + "      <name>Alibaba</name>\n" + "      <totalEmployees>58</totalEmployees>\n"
			+ "      <country>BARBADOS</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>TBC</tickerSymbol>\n" + "    <releaseDate>2019-01-17</releaseDate>\n"
			+ "    <price currency=\"USD\">925.1</price>\n" + "    <company>\n" + "      <name>Nestle</name>\n"
			+ "      <totalEmployees>114</totalEmployees>\n" + "      <country>ANDORRA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>GAA</tickerSymbol>\n"
			+ "    <releaseDate>2022-03-12</releaseDate>\n" + "    <price currency=\"USD\">723.6</price>\n"
			+ "    <company>\n" + "      <name>Ping An Insurance Group</name>\n"
			+ "      <totalEmployees>45</totalEmployees>\n" + "      <country>BARBADOS</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>EBC</tickerSymbol>\n"
			+ "    <releaseDate>2019-11-28</releaseDate>\n" + "    <price currency=\"USD\">370.0</price>\n"
			+ "    <company>\n" + "      <name>Home Depot</name>\n" + "      <totalEmployees>73</totalEmployees>\n"
			+ "      <country>ALGERIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>DAD</tickerSymbol>\n" + "    <releaseDate>2017-09-17</releaseDate>\n"
			+ "    <price currency=\"USD\">817.7</price>\n" + "    <company>\n"
			+ "      <name>Berkshire Hathaway</name>\n" + "      <totalEmployees>118</totalEmployees>\n"
			+ "      <country>AZERBAIJAN</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>TFZ</tickerSymbol>\n" + "    <releaseDate>2010-12-02</releaseDate>\n"
			+ "    <price currency=\"USD\">350.7</price>\n" + "    <company>\n" + "      <name>Roche Holding</name>\n"
			+ "      <totalEmployees>47</totalEmployees>\n" + "      <country>ARGENTINA</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>UAH</tickerSymbol>\n"
			+ "    <releaseDate>2007-12-05</releaseDate>\n" + "    <price currency=\"USD\">66.7</price>\n"
			+ "    <company>\n" + "      <name>China Constructionank</name>\n"
			+ "      <totalEmployees>53</totalEmployees>\n" + "      <country>AFGHANISTAN</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>IFS</tickerSymbol>\n"
			+ "    <releaseDate>2017-08-21</releaseDate>\n" + "    <price currency=\"USD\">483.3</price>\n"
			+ "    <company>\n" + "      <name>Chevron</name>\n" + "      <totalEmployees>120</totalEmployees>\n"
			+ "      <country>BAHRAIN</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>GWX</tickerSymbol>\n" + "    <releaseDate>2017-12-19</releaseDate>\n"
			+ "    <price currency=\"USD\">873.6</price>\n" + "    <company>\n"
			+ "      <name>Ping An Insurance Group</name>\n" + "      <totalEmployees>83</totalEmployees>\n"
			+ "      <country>BELARUS</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>GUB</tickerSymbol>\n" + "    <releaseDate>2020-08-10</releaseDate>\n"
			+ "    <price currency=\"USD\">455.6</price>\n" + "    <company>\n" + "      <name>JPMorgan Chase</name>\n"
			+ "      <totalEmployees>108</totalEmployees>\n" + "      <country>ARGENTINA</country>\n"
			+ "    </company>\n" + "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>QLV</tickerSymbol>\n"
			+ "    <releaseDate>2017-07-05</releaseDate>\n" + "    <price currency=\"USD\">408.0</price>\n"
			+ "    <company>\n" + "      <name>Intel</name>\n" + "      <totalEmployees>115</totalEmployees>\n"
			+ "      <country>ARMENIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>MFZ</tickerSymbol>\n" + "    <releaseDate>2015-08-02</releaseDate>\n"
			+ "    <price currency=\"USD\">128.4</price>\n" + "    <company>\n" + "      <name>Nike</name>\n"
			+ "      <totalEmployees>138</totalEmployees>\n" + "      <country>BELARUS</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>NHG</tickerSymbol>\n"
			+ "    <releaseDate>2018-04-22</releaseDate>\n" + "    <price currency=\"USD\">474.6</price>\n"
			+ "    <company>\n" + "      <name>Microsoft</name>\n" + "      <totalEmployees>115</totalEmployees>\n"
			+ "      <country>ALGERIA</country>\n" + "    </company>\n" + "  </stock>\n" + "  <stock>\n"
			+ "    <tickerSymbol>JLG</tickerSymbol>\n" + "    <releaseDate>2021-06-22</releaseDate>\n"
			+ "    <price currency=\"USD\">480.4</price>\n" + "    <company>\n" + "      <name>Microsoft</name>\n"
			+ "      <totalEmployees>55</totalEmployees>\n" + "      <country>AUSTRIA</country>\n" + "    </company>\n"
			+ "  </stock>\n" + "  <stock>\n" + "    <tickerSymbol>OKO</tickerSymbol>\n"
			+ "    <releaseDate>2005-05-01</releaseDate>\n" + "    <price currency=\"USD\">276.1</price>\n"
			+ "    <company>\n" + "      <name>Apple</name>\n" + "      <totalEmployees>71</totalEmployees>\n"
			+ "      <country>BANGLADESH</country>\n" + "    </company>\n" + "  </stock>\n" + "</stocks>\n" + "";

	public static void main(String[] args) {
		try {
			JSONObject jsonObj = XML.toJSONObject(XML_STRING);
			String json = jsonObj.toString(INDENTATION);

			System.out.println(json);
		} catch (JSONException ex) {
			ex.printStackTrace();
		}
	}
}
