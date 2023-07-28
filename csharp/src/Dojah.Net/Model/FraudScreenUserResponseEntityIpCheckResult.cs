/*
 * DOJAH Publilc APIs
 *
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Dojah.Net.Client.OpenAPIDateConverter;

namespace Dojah.Net.Model
{
    /// <summary>
    /// FraudScreenUserResponseEntityIpCheckResult
    /// </summary>
    [DataContract(Name = "FraudScreenUserResponse_entity_ip_check_result")]
    public partial class FraudScreenUserResponseEntityIpCheckResult : IEquatable<FraudScreenUserResponseEntityIpCheckResult>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FraudScreenUserResponseEntityIpCheckResult" /> class.
        /// </summary>
        /// <param name="ip">ip.</param>
        /// <param name="blacklists">blacklists.</param>
        /// <param name="anonymity">anonymity.</param>
        /// <param name="riskScore">riskScore.</param>
        /// <param name="ipDetails">ipDetails.</param>
        public FraudScreenUserResponseEntityIpCheckResult(string ip = default(string), FraudScreenUserResponseEntityIpCheckResultBlacklists blacklists = default(FraudScreenUserResponseEntityIpCheckResultBlacklists), FraudScreenUserResponseEntityIpCheckResultAnonymity anonymity = default(FraudScreenUserResponseEntityIpCheckResultAnonymity), FraudScreenUserResponseEntityIpCheckResultRiskScore riskScore = default(FraudScreenUserResponseEntityIpCheckResultRiskScore), FraudScreenUserResponseEntityIpCheckResultIpDetails ipDetails = default(FraudScreenUserResponseEntityIpCheckResultIpDetails))
        {
            this.Ip = ip;
            this.Blacklists = blacklists;
            this.Anonymity = anonymity;
            this.RiskScore = riskScore;
            this.IpDetails = ipDetails;
        }

        /// <summary>
        /// Gets or Sets Ip
        /// </summary>
        [DataMember(Name = "ip", EmitDefaultValue = false)]
        public string Ip { get; set; }

        /// <summary>
        /// Gets or Sets Blacklists
        /// </summary>
        [DataMember(Name = "blacklists", EmitDefaultValue = false)]
        public FraudScreenUserResponseEntityIpCheckResultBlacklists Blacklists { get; set; }

        /// <summary>
        /// Gets or Sets Anonymity
        /// </summary>
        [DataMember(Name = "anonymity", EmitDefaultValue = false)]
        public FraudScreenUserResponseEntityIpCheckResultAnonymity Anonymity { get; set; }

        /// <summary>
        /// Gets or Sets RiskScore
        /// </summary>
        [DataMember(Name = "risk_score", EmitDefaultValue = false)]
        public FraudScreenUserResponseEntityIpCheckResultRiskScore RiskScore { get; set; }

        /// <summary>
        /// Gets or Sets IpDetails
        /// </summary>
        [DataMember(Name = "ip_details", EmitDefaultValue = false)]
        public FraudScreenUserResponseEntityIpCheckResultIpDetails IpDetails { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FraudScreenUserResponseEntityIpCheckResult {\n");
            sb.Append("  Ip: ").Append(Ip).Append("\n");
            sb.Append("  Blacklists: ").Append(Blacklists).Append("\n");
            sb.Append("  Anonymity: ").Append(Anonymity).Append("\n");
            sb.Append("  RiskScore: ").Append(RiskScore).Append("\n");
            sb.Append("  IpDetails: ").Append(IpDetails).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as FraudScreenUserResponseEntityIpCheckResult);
        }

        /// <summary>
        /// Returns true if FraudScreenUserResponseEntityIpCheckResult instances are equal
        /// </summary>
        /// <param name="input">Instance of FraudScreenUserResponseEntityIpCheckResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FraudScreenUserResponseEntityIpCheckResult input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Ip == input.Ip ||
                    (this.Ip != null &&
                    this.Ip.Equals(input.Ip))
                ) && 
                (
                    this.Blacklists == input.Blacklists ||
                    (this.Blacklists != null &&
                    this.Blacklists.Equals(input.Blacklists))
                ) && 
                (
                    this.Anonymity == input.Anonymity ||
                    (this.Anonymity != null &&
                    this.Anonymity.Equals(input.Anonymity))
                ) && 
                (
                    this.RiskScore == input.RiskScore ||
                    (this.RiskScore != null &&
                    this.RiskScore.Equals(input.RiskScore))
                ) && 
                (
                    this.IpDetails == input.IpDetails ||
                    (this.IpDetails != null &&
                    this.IpDetails.Equals(input.IpDetails))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Ip != null)
                {
                    hashCode = (hashCode * 59) + this.Ip.GetHashCode();
                }
                if (this.Blacklists != null)
                {
                    hashCode = (hashCode * 59) + this.Blacklists.GetHashCode();
                }
                if (this.Anonymity != null)
                {
                    hashCode = (hashCode * 59) + this.Anonymity.GetHashCode();
                }
                if (this.RiskScore != null)
                {
                    hashCode = (hashCode * 59) + this.RiskScore.GetHashCode();
                }
                if (this.IpDetails != null)
                {
                    hashCode = (hashCode * 59) + this.IpDetails.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}